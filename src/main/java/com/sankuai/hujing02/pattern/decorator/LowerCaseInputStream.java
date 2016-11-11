package com.sankuai.hujing02.pattern.decorator;

import java.io.*;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/19 下午3:38
 * Description:
 */

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte b[], int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < len + result; ++ i) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            InputStream in = new StringBufferInputStream("I know the Decorator Pattern therefore I RULE!");
            LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(in);
            int c;
            while ((c = lowerCaseInputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
