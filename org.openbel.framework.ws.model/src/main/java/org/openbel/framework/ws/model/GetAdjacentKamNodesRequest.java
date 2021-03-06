/**
 * Copyright (C) 2012 Selventa, Inc.
 *
 * This file is part of the OpenBEL Framework.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The OpenBEL Framework is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the OpenBEL Framework. If not, see <http://www.gnu.org/licenses/>.
 *
 * Additional Terms under LGPL v3:
 *
 * This license does not authorize you and you are prohibited from using the
 * name, trademarks, service marks, logos or similar indicia of Selventa, Inc.,
 * or, in the discretion of other licensors or authors of the program, the
 * name, trademarks, service marks, logos or similar indicia of such authors or
 * licensors, in any marketing or advertising materials relating to your
 * distribution of the program or any covered product. This restriction does
 * not waive or limit your obligation to keep intact all copyright notices set
 * forth in the program as delivered to you.
 *
 * If you distribute the program in whole or in part, or any modified version
 * of the program, and you assume contractual liability to the recipient with
 * respect to the program or modified version, then you will indemnify the
 * authors and licensors of the program for any liabilities that these
 * contractual assumptions directly impose on those licensors and authors.
 */
package org.openbel.framework.ws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kamNode" type="{http://belframework.org/ws/schemas}KamNode"/>
 *         &lt;element name="direction" type="{http://belframework.org/ws/schemas}EdgeDirectionType" minOccurs="0"/>
 *         &lt;element name="edgeFilter" type="{http://belframework.org/ws/schemas}EdgeFilter" minOccurs="0"/>
 *         &lt;element name="nodeFilter" type="{http://belframework.org/ws/schemas}NodeFilter" minOccurs="0"/>
 *         &lt;element name="dialect" type="{http://belframework.org/ws/schemas}DialectHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "kamNode", "direction", "edgeFilter",
        "nodeFilter", "dialect" })
@XmlRootElement(name = "GetAdjacentKamNodesRequest")
public class GetAdjacentKamNodesRequest {

    @XmlElement(required = true)
    protected KamNode kamNode;
    protected EdgeDirectionType direction;
    protected EdgeFilter edgeFilter;
    protected NodeFilter nodeFilter;
    protected DialectHandle dialect;

    /**
     * Gets the value of the kamNode property.
     * 
     * @return possible object is {@link KamNode }
     * 
     */
    public KamNode getKamNode() {
        return kamNode;
    }

    /**
     * Sets the value of the kamNode property.
     * 
     * @param value
     *            allowed object is {@link KamNode }
     * 
     */
    public void setKamNode(KamNode value) {
        this.kamNode = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return possible object is {@link EdgeDirectionType }
     * 
     */
    public EdgeDirectionType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *            allowed object is {@link EdgeDirectionType }
     * 
     */
    public void setDirection(EdgeDirectionType value) {
        this.direction = value;
    }

    /**
     * Gets the value of the edgeFilter property.
     * 
     * @return possible object is {@link EdgeFilter }
     * 
     */
    public EdgeFilter getEdgeFilter() {
        return edgeFilter;
    }

    /**
     * Sets the value of the edgeFilter property.
     * 
     * @param value
     *            allowed object is {@link EdgeFilter }
     * 
     */
    public void setEdgeFilter(EdgeFilter value) {
        this.edgeFilter = value;
    }

    /**
     * Gets the value of the nodeFilter property.
     * 
     * @return possible object is {@link NodeFilter }
     * 
     */
    public NodeFilter getNodeFilter() {
        return nodeFilter;
    }

    /**
     * Sets the value of the nodeFilter property.
     * 
     * @param value
     *            allowed object is {@link NodeFilter }
     * 
     */
    public void setNodeFilter(NodeFilter value) {
        this.nodeFilter = value;
    }

    /**
     * Gets the value of the dialect property.
     * 
     * @return possible object is {@link DialectHandle }
     * 
     */
    public DialectHandle getDialect() {
        return dialect;
    }

    /**
     * Sets the value of the dialect property.
     * 
     * @param value
     *            allowed object is {@link DialectHandle }
     * 
     */
    public void setDialect(DialectHandle value) {
        this.dialect = value;
    }

}
