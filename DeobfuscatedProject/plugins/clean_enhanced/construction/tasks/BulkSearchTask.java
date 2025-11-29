/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.events.MenuEntryAdded
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.concurrent.ExecutorService;
import net.runelite.api.Client;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Bulk search", register=true)
public class BulkSearchTask
extends bz {
    private static  String[] lIlllIIII;
    private static  int[] lIlllIllI;

    private static void var1() {
        lIlllIIII = new String[lIlllIllI[3]];
        bC.lIlllIIII[bC.lIlllIllI[0]] = "Search-All";
        bC.lIlllIIII[bC.lIlllIllI[1]] = "Search";
        bC.lIlllIIII[bC.lIlllIllI[2]] = "Bird";
    }

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        super.a(menuEntryAdded);
    }

    private static String var2(String var3, String var4) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var6 = var4.toCharArray();
        int var7 = lIlllIllI[0];
        char[] var8 = var3.toCharArray();
        int var9 = var8.length;
        int var10 = lIlllIllI[0];
        while (bC.var11(var10, var9)) {
            char var12 = var8[var10];
            var5.append((char)(var12 ^ var6[var7 % var6.length]));
            0;
            ++var7;
            ++var10;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    @Override
    public boolean c(String string, String string2) {
        int n2;
        if (bC.var13(string.equals(lIlllIIII[lIlllIllI[1]]) ? 1 : 0) && bC.var13(string2.contains(lIlllIIII[lIlllIllI[2]]) ? 1 : 0)) {
            n2 = lIlllIllI[1];
            0;
            if null != null {
                return ((0x40 ^ 6 ^ (0x5D ^ 0x49)) & (99 + 3 - -30 + 83 ^ 8 + 92 - -20 + 13 ^ -1)) != 0;
            }
        } else {
            n2 = lIlllIllI[0];
        }
        return n2 != 0;
    }

    static {
        bC.var14();
        bC.var1();
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    private static void var14() {
        lIlllIllI = new int[4];
        bC.lIlllIllI[0] = (0x47 ^ 0x51) & ~(0x9C ^ 0x8A);
        bC.lIlllIllI[1] = 1;
        bC.lIlllIllI[2] = 2;
        bC.lIlllIllI[3] = 3;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public BulkSearchTask(Client client, ExecutorService executorService) {
        super(client, executorService, lIlllIIII[lIlllIllI[0]]);
    }

    public boolean run() {
        return lIlllIllI[0];
    }
}

