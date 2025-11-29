/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.MHelper;
import gg.squire.farmer.tasks.GameEnum10;
import gg.squire.farmer.tasks.GameEnum4;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LHelper {
    public static final  Set<Integer> bq;
    
    public static final  Set<P> bp;
    public static final  int bo;
    public static final  int bn;

    static {
        L.var2();
        bo = 2;
        bn = 3;
        bp = new MHelper();
        bq = Stream.of(au.values()).filter(au2 -> {
            boolean bl;
            if (!(bp.contains((Object == 0)au2.bh()) ? 1 : 0) || (au2 == au22)au.WEEDS)) {
                bl = 0;
                0;
                if (-2 > 0) {
                    return ((3 ^ 0x34) & ~(6 ^ 0x31)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).map(au::au).collect(Collectors.toUnmodifiableSet());
    }
}

