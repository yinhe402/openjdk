/*
 * Copyright 2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */

/* this file is generated by RelaxNGCC */
package com.sun.xml.internal.xsom.impl.parser.state;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import com.sun.xml.internal.xsom.impl.parser.NGCCRuntimeEx;

    import com.sun.xml.internal.xsom.*;
    import com.sun.xml.internal.xsom.parser.*;
    import com.sun.xml.internal.xsom.impl.*;
    import com.sun.xml.internal.xsom.impl.parser.*;
    import org.xml.sax.Locator;
    import org.xml.sax.ContentHandler;
    import org.xml.sax.helpers.*;
    import java.util.*;



class attributeUses extends NGCCHandler {
    private String use;
    private AttributesHolder owner;
    private ForeignAttributesImpl fa;
    private WildcardImpl wildcard;
    private AnnotationImpl annotation;
    private UName attDeclName;
    private AttributeDeclImpl anonymousDecl;
    private String defaultValue;
    private String fixedValue;
    private UName groupName;
    protected final NGCCRuntimeEx $runtime;
    private int $_ngcc_current_state;
    protected String $uri;
    protected String $localName;
    protected String $qname;

    public final NGCCRuntime getRuntime() {
        return($runtime);
    }

    public attributeUses(NGCCHandler parent, NGCCEventSource source, NGCCRuntimeEx runtime, int cookie, AttributesHolder _owner) {
        super(source, parent, cookie);
        $runtime = runtime;
        this.owner = _owner;
        $_ngcc_current_state = 5;
    }

    public attributeUses(NGCCRuntimeEx runtime, AttributesHolder _owner) {
        this(null, runtime, runtime, -1, _owner);
    }

    private void action0()throws SAXException {

          owner.setWildcard(wildcard);

}

    private void action1()throws SAXException {
        wloc = $runtime.copyLocator();
}

    private void action2()throws SAXException {

            owner.addAttGroup(new DelayedRef.AttGroup(
              $runtime, locator, $runtime.currentSchema, groupName ));

}

    private void action3()throws SAXException {
        locator=$runtime.copyLocator();
}

    private void action4()throws SAXException {

            if("prohibited".equals(use))
              owner.addProhibitedAttribute(attDeclName);
            else
              owner.addAttributeUse(attDeclName,
                new AttributeUseImpl( $runtime.document, annotation,locator,fa,decl,
                  $runtime.createXmlString(defaultValue),
                  $runtime.createXmlString(fixedValue),
                  "required".equals(use)));

}

    private void action5()throws SAXException {

                  decl = new DelayedRef.Attribute(
                    $runtime, locator, $runtime.currentSchema, attDeclName );

}

    private void action6()throws SAXException {

                decl = anonymousDecl;
                attDeclName = new UName(
                  anonymousDecl.getTargetNamespace(),
                  anonymousDecl.getName());
                defaultValue = null;
                fixedValue = null;

}

    private void action7()throws SAXException {

            locator=$runtime.copyLocator();
            use=null;
            defaultValue=null;
            fixedValue=null;
            decl=null;
            annotation=null;

}

    public void enterElement(String $__uri, String $__local, String $__qname, Attributes $attrs) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 25:
            {
                if(($ai = $runtime.getAttributeIndex("","fixed"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 17;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 1:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attribute"))) {
                    $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                    action7();
                    $_ngcc_current_state = 33;
                }
                else {
                    if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attributeGroup"))) {
                        $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                        action3();
                        $_ngcc_current_state = 13;
                    }
                    else {
                        if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("anyAttribute"))) {
                            $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                            action1();
                            $_ngcc_current_state = 3;
                        }
                        else {
                            $_ngcc_current_state = 0;
                            $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                        }
                    }
                }
            }
            break;
        case 8:
            {
                action2();
                $_ngcc_current_state = 7;
                $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        case 16:
            {
                action4();
                $_ngcc_current_state = 15;
                $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        case 17:
            {
                if((($ai = $runtime.getAttributeIndex("","name"))>=0 || ($ai = $runtime.getAttributeIndex("","form"))>=0)) {
                    NGCCHandler h = new attributeDeclBody(this, super._source, $runtime, 42, locator,true,defaultValue,fixedValue);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    if(($ai = $runtime.getAttributeIndex("","ref"))>=0) {
                        $runtime.consumeAttribute($ai);
                        $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                    }
                    else {
                        unexpectedEnterElement($__qname);
                    }
                }
            }
            break;
        case 9:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation"))) {
                    NGCCHandler h = new annotation(this, super._source, $runtime, 24, null,AnnotationContext.ATTRIBUTE_USE);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 8;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterElement(this, super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        case 29:
            {
                if(($ai = $runtime.getAttributeIndex("","default"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 25;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 19:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation"))) {
                    NGCCHandler h = new annotation(this, super._source, $runtime, 35, null,AnnotationContext.ATTRIBUTE_USE);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 18;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 33:
            {
                if(($ai = $runtime.getAttributeIndex("","use"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    $_ngcc_current_state = 29;
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
            }
            break;
        case 5:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attribute"))) {
                    $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                    action7();
                    $_ngcc_current_state = 33;
                }
                else {
                    if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attributeGroup"))) {
                        $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                        action3();
                        $_ngcc_current_state = 13;
                    }
                    else {
                        $_ngcc_current_state = 1;
                        $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                    }
                }
            }
            break;
        case 3:
            {
                if((($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation")) || (($ai = $runtime.getAttributeIndex("","namespace"))>=0 || ($ai = $runtime.getAttributeIndex("","processContents"))>=0))) {
                    NGCCHandler h = new wildcardBody(this, super._source, $runtime, 17, wloc);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 13:
            {
                if(($ai = $runtime.getAttributeIndex("","ref"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        default:
            {
                unexpectedEnterElement($__qname);
            }
            break;
        }
    }

    public void leaveElement(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 25:
            {
                if(($ai = $runtime.getAttributeIndex("","fixed"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 17;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 18:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attribute"))) {
                    NGCCHandler h = new foreignAttributes(this, super._source, $runtime, 33, null);
                    spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 1:
            {
                $_ngcc_current_state = 0;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 8:
            {
                action2();
                $_ngcc_current_state = 7;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 16:
            {
                action4();
                $_ngcc_current_state = 15;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 7:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attributeGroup"))) {
                    $runtime.onLeaveElementConsumed($__uri, $__local, $__qname);
                    $_ngcc_current_state = 1;
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 17:
            {
                if(((($ai = $runtime.getAttributeIndex("","name"))>=0 && ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attribute"))) || (($ai = $runtime.getAttributeIndex("","form"))>=0 && ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attribute"))))) {
                    NGCCHandler h = new attributeDeclBody(this, super._source, $runtime, 42, locator,true,defaultValue,fixedValue);
                    spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
                }
                else {
                    if(($ai = $runtime.getAttributeIndex("","ref"))>=0) {
                        $runtime.consumeAttribute($ai);
                        $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                    }
                    else {
                        unexpectedLeaveElement($__qname);
                    }
                }
            }
            break;
        case 9:
            {
                $_ngcc_current_state = 8;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 0:
            {
                revertToParentFromLeaveElement(this, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 29:
            {
                if(($ai = $runtime.getAttributeIndex("","default"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 25;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 19:
            {
                $_ngcc_current_state = 18;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 33:
            {
                if(($ai = $runtime.getAttributeIndex("","use"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    $_ngcc_current_state = 29;
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 2:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("anyAttribute"))) {
                    $runtime.onLeaveElementConsumed($__uri, $__local, $__qname);
                    $_ngcc_current_state = 0;
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 15:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attribute"))) {
                    $runtime.onLeaveElementConsumed($__uri, $__local, $__qname);
                    $_ngcc_current_state = 1;
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 3:
            {
                if(((($ai = $runtime.getAttributeIndex("","namespace"))>=0 && ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("anyAttribute"))) || ((($ai = $runtime.getAttributeIndex("","processContents"))>=0 && ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("anyAttribute"))) || ($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("anyAttribute"))))) {
                    NGCCHandler h = new wildcardBody(this, super._source, $runtime, 17, wloc);
                    spawnChildFromLeaveElement(h, $__uri, $__local, $__qname);
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 5:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 13:
            {
                if(($ai = $runtime.getAttributeIndex("","ref"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        default:
            {
                unexpectedLeaveElement($__qname);
            }
            break;
        }
    }

    public void enterAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 25:
            {
                if(($__uri.equals("") && $__local.equals("fixed"))) {
                    $_ngcc_current_state = 27;
                }
                else {
                    $_ngcc_current_state = 17;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 1:
            {
                $_ngcc_current_state = 0;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 8:
            {
                action2();
                $_ngcc_current_state = 7;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 16:
            {
                action4();
                $_ngcc_current_state = 15;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 17:
            {
                if((($__uri.equals("") && $__local.equals("name")) || ($__uri.equals("") && $__local.equals("form")))) {
                    NGCCHandler h = new attributeDeclBody(this, super._source, $runtime, 42, locator,true,defaultValue,fixedValue);
                    spawnChildFromEnterAttribute(h, $__uri, $__local, $__qname);
                }
                else {
                    if(($__uri.equals("") && $__local.equals("ref"))) {
                        $_ngcc_current_state = 22;
                    }
                    else {
                        unexpectedEnterAttribute($__qname);
                    }
                }
            }
            break;
        case 9:
            {
                $_ngcc_current_state = 8;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 0:
            {
                revertToParentFromEnterAttribute(this, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 29:
            {
                if(($__uri.equals("") && $__local.equals("default"))) {
                    $_ngcc_current_state = 31;
                }
                else {
                    $_ngcc_current_state = 25;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 19:
            {
                $_ngcc_current_state = 18;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 33:
            {
                if(($__uri.equals("") && $__local.equals("use"))) {
                    $_ngcc_current_state = 35;
                }
                else {
                    $_ngcc_current_state = 29;
                    $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
                }
            }
            break;
        case 5:
            {
                $_ngcc_current_state = 1;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 3:
            {
                if((($__uri.equals("") && $__local.equals("namespace")) || ($__uri.equals("") && $__local.equals("processContents")))) {
                    NGCCHandler h = new wildcardBody(this, super._source, $runtime, 17, wloc);
                    spawnChildFromEnterAttribute(h, $__uri, $__local, $__qname);
                }
                else {
                    unexpectedEnterAttribute($__qname);
                }
            }
            break;
        case 13:
            {
                if(($__uri.equals("") && $__local.equals("ref"))) {
                    $_ngcc_current_state = 12;
                }
                else {
                    unexpectedEnterAttribute($__qname);
                }
            }
            break;
        default:
            {
                unexpectedEnterAttribute($__qname);
            }
            break;
        }
    }

    public void leaveAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 25:
            {
                $_ngcc_current_state = 17;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 34:
            {
                if(($__uri.equals("") && $__local.equals("use"))) {
                    $_ngcc_current_state = 29;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 1:
            {
                $_ngcc_current_state = 0;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 8:
            {
                action2();
                $_ngcc_current_state = 7;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 16:
            {
                action4();
                $_ngcc_current_state = 15;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 9:
            {
                $_ngcc_current_state = 8;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 0:
            {
                revertToParentFromLeaveAttribute(this, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 11:
            {
                if(($__uri.equals("") && $__local.equals("ref"))) {
                    $_ngcc_current_state = 9;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 29:
            {
                $_ngcc_current_state = 25;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 19:
            {
                $_ngcc_current_state = 18;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 33:
            {
                $_ngcc_current_state = 29;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 30:
            {
                if(($__uri.equals("") && $__local.equals("default"))) {
                    $_ngcc_current_state = 25;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 21:
            {
                if(($__uri.equals("") && $__local.equals("ref"))) {
                    $_ngcc_current_state = 19;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 26:
            {
                if(($__uri.equals("") && $__local.equals("fixed"))) {
                    $_ngcc_current_state = 17;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        case 5:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveAttribute($__qname);
            }
            break;
        }
    }

    public void text(String $value) throws SAXException {
        int $ai;
        switch($_ngcc_current_state) {
        case 25:
            {
                if(($ai = $runtime.getAttributeIndex("","fixed"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 17;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 12:
            {
                NGCCHandler h = new qname(this, super._source, $runtime, 27);
                spawnChildFromText(h, $value);
            }
            break;
        case 1:
            {
                $_ngcc_current_state = 0;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 31:
            {
                defaultValue = $value;
                $_ngcc_current_state = 30;
            }
            break;
        case 22:
            {
                NGCCHandler h = new qname(this, super._source, $runtime, 38);
                spawnChildFromText(h, $value);
            }
            break;
        case 8:
            {
                action2();
                $_ngcc_current_state = 7;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 16:
            {
                action4();
                $_ngcc_current_state = 15;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 35:
            {
                use = $value;
                $_ngcc_current_state = 34;
            }
            break;
        case 17:
            {
                if(($ai = $runtime.getAttributeIndex("","form"))>=0) {
                    NGCCHandler h = new attributeDeclBody(this, super._source, $runtime, 42, locator,true,defaultValue,fixedValue);
                    spawnChildFromText(h, $value);
                }
                else {
                    if(($ai = $runtime.getAttributeIndex("","name"))>=0) {
                        NGCCHandler h = new attributeDeclBody(this, super._source, $runtime, 42, locator,true,defaultValue,fixedValue);
                        spawnChildFromText(h, $value);
                    }
                    else {
                        if(($ai = $runtime.getAttributeIndex("","ref"))>=0) {
                            $runtime.consumeAttribute($ai);
                            $runtime.sendText(super._cookie, $value);
                        }
                    }
                }
            }
            break;
        case 9:
            {
                $_ngcc_current_state = 8;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 0:
            {
                revertToParentFromText(this, super._cookie, $value);
            }
            break;
        case 29:
            {
                if(($ai = $runtime.getAttributeIndex("","default"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 25;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 19:
            {
                $_ngcc_current_state = 18;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 33:
            {
                if(($ai = $runtime.getAttributeIndex("","use"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
                else {
                    $_ngcc_current_state = 29;
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 3:
            {
                if(($ai = $runtime.getAttributeIndex("","processContents"))>=0) {
                    NGCCHandler h = new wildcardBody(this, super._source, $runtime, 17, wloc);
                    spawnChildFromText(h, $value);
                }
                else {
                    if(($ai = $runtime.getAttributeIndex("","namespace"))>=0) {
                        NGCCHandler h = new wildcardBody(this, super._source, $runtime, 17, wloc);
                        spawnChildFromText(h, $value);
                    }
                }
            }
            break;
        case 5:
            {
                $_ngcc_current_state = 1;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 27:
            {
                fixedValue = $value;
                $_ngcc_current_state = 26;
            }
            break;
        case 13:
            {
                if(($ai = $runtime.getAttributeIndex("","ref"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        }
    }

    public void onChildCompleted(Object $__result__, int $__cookie__, boolean $__needAttCheck__)throws SAXException {
        switch($__cookie__) {
        case 33:
            {
                fa = ((ForeignAttributesImpl)$__result__);
                $_ngcc_current_state = 16;
            }
            break;
        case 27:
            {
                groupName = ((UName)$__result__);
                $_ngcc_current_state = 11;
            }
            break;
        case 38:
            {
                attDeclName = ((UName)$__result__);
                action5();
                $_ngcc_current_state = 21;
            }
            break;
        case 42:
            {
                anonymousDecl = ((AttributeDeclImpl)$__result__);
                action6();
                $_ngcc_current_state = 16;
            }
            break;
        case 24:
            {
                $_ngcc_current_state = 8;
            }
            break;
        case 35:
            {
                annotation = ((AnnotationImpl)$__result__);
                $_ngcc_current_state = 18;
            }
            break;
        case 17:
            {
                wildcard = ((WildcardImpl)$__result__);
                action0();
                $_ngcc_current_state = 2;
            }
            break;
        }
    }

    public boolean accepted() {
        return((($_ngcc_current_state == 5) || (($_ngcc_current_state == 0) || ($_ngcc_current_state == 1))));
    }


      private Ref.Attribute decl;
      private Locator wloc; // locator for wildcards
      private Locator locator;

}
