/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.mta.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;

public final class GameEnum
extends Enum<i> {
    private final  int widgetId;
    public static final  /* enum */ i PENTAMID;
    private final  int groupId;

    public static final  /* enum */ i CUBE;
    private static final  i[] $VALUES;
    public static final  /* enum */ i CYLINDER;
    public static final  /* enum */ i ICOSAHEDRON;
    private final  String itemName;
    private final  String pile_name;

    private static boolean lIIIllIIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    static {
        i.lIIIllIIllIlIII();
        i.lIIIllIIllIIlll();
        CUBE = new GameEnum(lllIllIIIIII[lllIllIIIIlI[1]], lllIllIIIIlI[2], lllIllIIIIlI[3], lllIllIIIIII[lllIllIIIIlI[4]]);
        CYLINDER = new GameEnum(lllIllIIIIII[lllIllIIIIlI[6]], lllIllIIIIlI[2], lllIllIIIIlI[7], lllIllIIIIII[lllIllIIIIlI[8]]);
        PENTAMID = new GameEnum(lllIllIIIIII[lllIllIIIIlI[10]], lllIllIIIIlI[2], lllIllIIIIlI[11], lllIllIIIIII[lllIllIIIIlI[12]]);
        ICOSAHEDRON = new GameEnum(lllIllIIIIII[lllIllIIIIlI[3]], lllIllIIIIlI[2], lllIllIIIIlI[14], lllIllIIIIII[lllIllIIIIlI[15]]);
        i[] iArray = new i[lllIllIIIIlI[6]];
        iArray[i.lllIllIIIIlI[0]] = CUBE;
        iArray[i.lllIllIIIIlI[1]] = CYLINDER;
        iArray[i.lllIllIIIIlI[4]] = PENTAMID;
        iArray[i.lllIllIIIIlI[5]] = ICOSAHEDRON;
        $VALUES = iArray;
    }

    public String y() {
        return this.pile_name;
    }

        return String.valueOf(var1);
    }

    private static void lIIIllIIllIIlll() {
        lllIllIIIIII = new String[lllIllIIIIlI[7]];
        i.lllIllIIIIII[i.lllIllIIIIlI[0]] = "CUBE";
        i.lllIllIIIIII[i.lllIllIIIIlI[1]] = "Cube";
        i.lllIllIIIIII[i.lllIllIIIIlI[4]] = "Cube Pile";
        i.lllIllIIIIII[i.lllIllIIIIlI[5]] = "CYLINDER";
        i.lllIllIIIIII[i.lllIllIIIIlI[6]] = "Cylinder";
        i.lllIllIIIIII[i.lllIllIIIIlI[8]] = "Cylinder Pile";
        i.lllIllIIIIII[i.lllIllIIIIlI[9]] = "PENTAMID";
        i.lllIllIIIIII[i.lllIllIIIIlI[10]] = "Pentamid";
        i.lllIllIIIIII[i.lllIllIIIIlI[12]] = "Pentamid Pile";
        i.lllIllIIIIII[i.lllIllIIIIlI[13]] = "ICOSAHEDRON";
        i.lllIllIIIIII[i.lllIllIIIIlI[3]] = "Icosahedron";
        i.lllIllIIIIII[i.lllIllIIIIlI[15]] = "Icosahedron Pile";
    }

    public int x() {
        return this.widgetId;
    }

    public String v() {
        return this.itemName;
    }

    public int w() {
        return this.groupId;
    }

    private GameEnum(String string2, int n3, int n4, String string3) {
        this.itemName = string2;
        this.groupId = n3;
        this.widgetId = n4;
        this.pile_name = string3;
    }

    public boolean z() {
        return Widgets.isVisible((Widget)Widgets.get((int)this.groupId, (int)this.widgetId));
    }
}

