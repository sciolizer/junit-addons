/*
 * The JUnit-addons Software License, Version 1.0
 *     (based on the Apache Software License, Version 1.1)
 *
 * Copyright (c) 2003 Vladimir R. Bossicard.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by Vladimir R.
 *        Bossicard as well as other contributors
 *        (http://junit-addons.sourceforge.net/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The name "JUnit-addons" must not be used to endorse or promote
 *    products derived from this software without prior written
 *    permission. For written permission, please contact
 *    vbossica@users.sourceforge.net.
 *
 * 5. Products derived from this software may not be called "JUnit-addons"
 *    nor may "JUnit-addons" appear in their names without prior written
 *    permission of the project managers.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ======================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals.  For more information on the JUnit-addons Project, please
 * see <http://junit-addons.sourceforge.net/>.
 */

package junitx.util;

/**
 * Interface used by the <tt>ArchiveSuiteBuilder</tt> and
 * <tt>DirectorySuiteBuilder</tt> to decide if a class must be included into the
 * <tt>TestSuite</tt>.
 * 
 * @version $Revision: 1.4 $ $Date: 2003/05/22 02:24:15 $
 * @author <a href="mailto:vbossica@users.sourceforge.net">Vladimir R. Bossicard</a>
 */
public interface TestFilter {

    void setRoot(String root);

    /**
     * Returns <tt>true</tt> if the given classpath represents a class that can
     * be potentially included into the <tt>TestSuite</tt>.
     * 
     * @see SimpleTestFilter#getClassName(String)
     * @see SimpleTestFilter#getPackageName(String)
     */
    boolean include(String classpath);
    
    /**
     * Returns <tt>true</tt> if the given class must be included into the
     * <tt>TestSuite</tt>.
     * 
     * @see SimpleTestFilter#getClassName(Class)
     * @see SimpleTestFilter#getPackageName(Class)
     */
    boolean include(Class cls);

}
