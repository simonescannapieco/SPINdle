/**
 * SPINdle (version 2.2.2)
 * Copyright (C) 2009-2012 NICTA Ltd.
 *
 * This file is part of SPINdle project.
 * 
 * SPINdle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SPINdle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with SPINdle.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.30 at 12:44:15 PM EST 
//


package spindle.io.xjc.dom2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="convert" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctModeConversionRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conflict" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctModeConflictRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exclude" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctModeExclusionRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="literalVariable" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctLiteralVariablePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="literalBooleanFunction" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctLiteralBooleanFunctionPair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="fact" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctLiteral"/>
 *           &lt;element name="rule" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctRule"/>
 *         &lt;/choice>
 *         &lt;element name="superiority" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctSuperiority" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "convert",
    "conflict",
    "exclude",
    "literalVariable",
    "literalBooleanFunction",
    "factOrRule",
    "superiority"
})
@XmlRootElement(name = "theory", namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
public class Theory {

    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected String description;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected List<CtModeConversionRule> convert;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected List<CtModeConflictRule> conflict;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected List<CtModeExclusionRule> exclude;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected List<CtLiteralVariablePair> literalVariable;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected List<CtLiteralBooleanFunctionPair> literalBooleanFunction;
    @XmlElements({
        @XmlElement(name = "fact", namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd", type = CtLiteral.class),
        @XmlElement(name = "rule", namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd", type = CtRule.class)
    })
    protected List<Object> factOrRule;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected List<CtSuperiority> superiority;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the convert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtModeConversionRule }
     * 
     * 
     */
    public List<CtModeConversionRule> getConvert() {
        if (convert == null) {
            convert = new ArrayList<CtModeConversionRule>();
        }
        return this.convert;
    }

    /**
     * Gets the value of the conflict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conflict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConflict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtModeConflictRule }
     * 
     * 
     */
    public List<CtModeConflictRule> getConflict() {
        if (conflict == null) {
            conflict = new ArrayList<CtModeConflictRule>();
        }
        return this.conflict;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtModeExclusionRule }
     * 
     * 
     */
    public List<CtModeExclusionRule> getExclude() {
        if (exclude == null) {
            exclude = new ArrayList<CtModeExclusionRule>();
        }
        return this.exclude;
    }

    /**
     * Gets the value of the literalVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the literalVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiteralVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtLiteralVariablePair }
     * 
     * 
     */
    public List<CtLiteralVariablePair> getLiteralVariable() {
        if (literalVariable == null) {
            literalVariable = new ArrayList<CtLiteralVariablePair>();
        }
        return this.literalVariable;
    }

    /**
     * Gets the value of the literalBooleanFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the literalBooleanFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiteralBooleanFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtLiteralBooleanFunctionPair }
     * 
     * 
     */
    public List<CtLiteralBooleanFunctionPair> getLiteralBooleanFunction() {
        if (literalBooleanFunction == null) {
            literalBooleanFunction = new ArrayList<CtLiteralBooleanFunctionPair>();
        }
        return this.literalBooleanFunction;
    }

    /**
     * Gets the value of the factOrRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factOrRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactOrRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtLiteral }
     * {@link CtRule }
     * 
     * 
     */
    public List<Object> getFactOrRule() {
        if (factOrRule == null) {
            factOrRule = new ArrayList<Object>();
        }
        return this.factOrRule;
    }

    /**
     * Gets the value of the superiority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superiority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperiority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtSuperiority }
     * 
     * 
     */
    public List<CtSuperiority> getSuperiority() {
        if (superiority == null) {
            superiority = new ArrayList<CtSuperiority>();
        }
        return this.superiority;
    }

}
