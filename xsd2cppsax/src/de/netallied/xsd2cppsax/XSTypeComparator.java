/**
 *   Copyright &copy; 2008-2012 NetAllied Systems GmbH, Ravensburg, Germany. 
 *       
 *   Licensed under the MIT Open Source License, 
 *   for details please see LICENSE file or the website
 *   http://www.opensource.org/licenses/mit-license.php
*/
package de.netallied.xsd2cppsax;

import java.util.Comparator;
import java.util.SortedMap;

import org.apache.xerces.xs.XSTypeDefinition;

/**
 * Allows comparison of {@link XSTypeDefinition}s. That way they can be used as
 * keys in a {@link SortedMap}.
 * 
 */
public class XSTypeComparator implements Comparator<XSTypeDefinition> {

    /**
     * {@inheritDoc}
     * 
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    public int compare(XSTypeDefinition o1, XSTypeDefinition o2) {
        if (o1.equals(o2))
            return 0;

        String str01 = o1.toString();
        String str02 = o2.toString();
        return str01.compareTo(str02);
    }
}
