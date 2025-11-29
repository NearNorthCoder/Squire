/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 */
package gg.squire.templetrekking.tasks;

import gg.squire.templetrekking.tasks.HandlingBogTask;
import java.util.Comparator;
import net.runelite.api.TileObject;

public class UHelper
implements Comparator<TileObject> {
    
    final  t ae;

    static {
        u.lIlIlllllllIlIl();
    }

    @Override
    public  int compare(Object object, Object object2) {
        return this.a((TileObject)object, (TileObject)object2);
    }

    public int a(TileObject tileObject, TileObject tileObject2) {
        Integer n2 = -tileObject.getWorldY() * lIIllIIllIIll[0] + tileObject.getWorldX();
        Integer n3 = -tileObject2.getWorldY() * lIIllIIllIIll[0] + tileObject2.getWorldX();
        return n2.compareTo(n3);
    }

    public UHelper(t t2) {
        this.ae = t2;
    }

}

