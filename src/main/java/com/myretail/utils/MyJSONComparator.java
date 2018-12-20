/**
 * 
 */
package com.myretail.utils;

import java.util.Comparator;

import com.myretail.service.beans.Product2Display;

/**
 * @author Banu
 *
 */
public class MyJSONComparator implements Comparator<Product2Display> {

@Override
public int compare(Product2Display o1, Product2Display o2) {
    return o1.getDisocunt().compareTo(o2.getDisocunt());
}

}