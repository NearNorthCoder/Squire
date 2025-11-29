/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.quest.tasks;

import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import gg.squire.quest.tasks.DHelper;
import gg.squire.quest.tasks.QuestManager;
import gg.squire.quest.tasks.IHelper;

public class KHelper
extends QuestManager {
    private final  List<d> ac;
    
    private  String ae;
    private final  boolean ad;

    public KHelper(WorldPoint ... worldPointArray) {
        this.ac = Stream.of(worldPointArray).map(d::new).collect(i.w());
        this.ad = var1[1];
    }

    private static boolean var3(Object object) {
        return object != null;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    static {
        k.var5();
        k.var6();
    }

    public KHelper(String string, boolean bl, d d2) {
        int n2;
        this.ae = string;
        if (k.var4(bl)) {
            n2 = var1[1];
            0;
            if (2 != 2) {
                throw null;
            }
        } else {
            n2 = var1[0];
        }
        this.ad = n2;
        d[] dArray = new d[var1[1]];
        dArray[k.var1[0]] = d2;
        this.ac = i.a(dArray);
    }

    public KHelper(boolean bl, WorldPoint ... worldPointArray) {
        this.ac = Stream.of(worldPointArray).map(d::new).collect(i.w());
        this.ad = bl;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var1[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var1[0];
        while (k.var16(var15, var14)) {
            char var17 = var13[var15];
            var10.append((char)(var17 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (((0x54 ^ 0x35) & ~(3 ^ 0x62)) == 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void var6() {
        var2 = new String[var1[1]];
        k.var2[k.var1[0]] = k.var7("", "WAWrD");
    }

    @Override
    @Nonnull
    public String j() {
        String string;
        if (k.var18(this.ae)) {
            string = var2[var1[0]];
            0;
            if (3 <= 1) {
                return null;
            }
        } else {
            k var19;
            string = var19.ae;
        }
        return string;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    public KHelper(String string, d d2) {
        this(string, var1[0], d2);
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    public KHelper(d ... dArray) {
        this.ac = i.a(dArray);
        this.ad = var1[1];
    }

    private static void var5() {
        var1 = new int[2];
        k.var1[0] = (0x79 ^ 0x6D) & ~(0xBF ^ 0xAB);
        k.var1[1] = 1;
    }

    @Override
    public boolean a(Client client) {
        Player player = client.getLocalPlayer();
        if (k.var3(player) && k.var3(this.ac)) {
            boolean bl;
            WorldPoint worldPoint = WorldPoint.fromLocalInstance((Client)client, (LocalPoint)player.getLocalLocation());
            int n2 = this.ac.stream().anyMatch(d2 -> d2.a(worldPoint)) ? 1 : 0;
            if (k.var20(n2, this.ad)) {
                bl = var1[1];
                0;
                
            } else {
                bl = var1[0];
            }
            return bl;
        }
        return var1[0];
    }

    public KHelper(boolean bl, d ... dArray) {
        this.ac = i.a(dArray);
        this.ad = bl;
    }

    private static boolean var20(int n2, int n3) {
        return n2 == n3;
    }
}

