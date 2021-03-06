/*
 * ArrayUtils.java
 *
 * Created on 28 March 2008, 11:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.shtrih.util;

/**
 * @author V.Kravtsov
 */
public class ArrayUtils {

    private ArrayUtils() {
    }

    public static byte[] copyOf(byte[] src) {
        byte result[] = new byte[src.length];
        System.arraycopy(src, 0, result, 0, src.length);
        return result;
    }

    public static byte[] longToBytes(long v, int len) throws Exception {
        byte buffer[] = new byte[len];
        for (int i = 0; i < len; i++) {
            buffer[len-i-1] = (byte) (v >>> 8 * i);
        }
        return buffer;
    }

}
