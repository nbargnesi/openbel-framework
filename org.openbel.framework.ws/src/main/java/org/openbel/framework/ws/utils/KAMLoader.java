package org.openbel.framework.ws.utils;

import java.util.List;

import org.openbel.framework.api.KamCacheService;
import org.openbel.framework.internal.KAMCatalogDao;
import org.openbel.framework.internal.KAMCatalogDao.KamInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Loads all the KAMs found in the catalog on startup.
 * 
 * @author {@code Nick Bargnesi}
 */
public class KAMLoader implements InitializingBean {

    @Autowired
    private KAMCatalogDao catalog;
    @Autowired
    private KamCacheService cacheSvc;

    /**
     * {@inheritDoc}
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Logger logger = LoggerFactory.getLogger(KAMLoader.class);
        List<KamInfo> kaminfos = catalog.getCatalog();
        logger.info("KAMLoader found {} KAMs", new Object[] { kaminfos.size() });
        for (KamInfo kaminfo : kaminfos) {
            logger.info("loading {}", kaminfo.getName());
            cacheSvc.loadKam(kaminfo, null);
            logger.info("{} loaded", kaminfo.getName());
        }
        logger.info("All KAMs loaded");
    }

}
