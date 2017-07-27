package com.github.why168;

import java.io.*;

/**
 * @author Edwin.Wu
 * @version 2016/12/21 11:45
 * @since JDK1.8
 */
public class BeanUtil {

    /**
     * 深度克隆工具类
     *
     * @param src 对象
     * @param <T> 对象
     * @return 对象
     * @throws RuntimeException 异常
     */
    @SuppressWarnings("unchecked")
    public static <T> T cloneTo(T src) throws RuntimeException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        T dist = null;
        try {
            /* 写入当前对象的二进制流 */
            bos = new ByteArrayOutputStream();
            out = new ObjectOutputStream(bos);
            out.writeObject(src);
            out.flush();

            /* 读出二进制流产生的新对象 */
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            in = new ObjectInputStream(bis);
            dist = (T) in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (out != null)
                try {
                    out.close();
                    out = null;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            if (in != null)
                try {
                    in.close();
                    in = null;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            if (bos != null)
                try {
                    bos.close();
                    bos = null;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

        }
        return dist;
    }
}
