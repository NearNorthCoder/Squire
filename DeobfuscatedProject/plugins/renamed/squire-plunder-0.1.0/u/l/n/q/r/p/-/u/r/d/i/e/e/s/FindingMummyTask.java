/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a_Unknown;

/* TASK: Finding Mummy -> FindingmummyTask */
@TaskDesc(name="Finding Mummy", priority=15, register=true)
public class FindingMummyTask
extends Task {
    private static /* synthetic */ String[] llllllIlIllI;
    private final /* synthetic */ Client H;
    private static /* synthetic */ int[] llllllIlIlll;
    private final /* synthetic */ a F;
    private final /* synthetic */ SquirePlunderConfig G;

    private static void lIIlIlIIIlllIII() {
        llllllIlIllI = new String[llllllIlIlll[15]];
        m.llllllIlIllI[m.llllllIlIlll[1]] = m."Tomb Door";
        m.llllllIlIllI[m.llllllIlIlll[2]] = m."Quick-leave";
        m.llllllIlIllI[m.llllllIlIlll[4]] = m."Tomb Door";
        m.llllllIlIllI[m.llllllIlIlll[5]] = m."Leave Tomb";
        m.llllllIlIllI[m.llllllIlIlll[6]] = m."An anonymous looking door";
        m.llllllIlIllI[m.llllllIlIlll[13]] = m."You find a door! You open it.";
        m.llllllIlIllI[m.llllllIlIlll[14]] = m."Search";
    }

    private static boolean lIIlIlIIIllllll(Object object) {
        return object == null;
    }

    private static void lIIlIlIIIlllIIl() {
        llllllIlIlll = new int[17];
        m.llllllIlIlll[0] = -(0xFFFFB3B7 & 0x7EE9) & (0xFFFFFFFF & 0x3BE7);
        m.llllllIlIlll[1] = (109 + 72 - 56 + 71 ^ 123 + 91 - 166 + 94) & (0xAC ^ 0xBB ^ (0xF ^ 0x52) ^ -1);
        m.llllllIlIlll[2] = 1;
        m.llllllIlIlll[3] = -(0xFFFFFB1D & 0x75EB) & (0xFFFFF7FF & 0x7FFB);
        m.llllllIlIlll[4] = 2;
        m.llllllIlIlll[5] = 3;
        m.llllllIlIlll[6] = 0xBC ^ 0xB8;
        m.llllllIlIlll[7] = -(0xFFFF8F27 & 0x71FD) & (0xFFFF8DFF & 0x7FFD);
        m.llllllIlIlll[8] = 0xFFFF8EF6 & 0x7BFB;
        m.llllllIlIlll[9] = 0xFFFFFBFF & 0x55EE;
        m.llllllIlIlll[10] = 0xFFFFF1F7 & 0x5FF9;
        m.llllllIlIlll[11] = 0xFFFFF74D & 0x5BB7;
        m.llllllIlIlll[12] = 0xFFFFF3FB & 0x5DFF;
        m.llllllIlIlll[13] = 0xB9 ^ 0xBC;
        m.llllllIlIlll[14] = 0xB0 ^ 0x94 ^ (0x7A ^ 0x58);
        m.llllllIlIlll[15] = 0x4D ^ 0x4A;
        m.llllllIlIlll[16] = 0x9A ^ 0x86 ^ (0x5F ^ 0x4B);
    }

    private static boolean lIIlIlIIIlllIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIlIlIIIllIlll(String var3, String var2) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), llllllIlIlll[16]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(llllllIlIlll[4], var17);
            return new String(var18.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIIllIllI(String var7, String var9) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var10 = var9.toCharArray();
        int var1 = llllllIlIlll[1];
        char[] var4 = var7.toCharArray();
        int var5 = var4.length;
        int var6 = llllllIlIlll[1];
        while (m.lIIlIlIIIllllII(var6, var5)) {
            char var11 = var4[var6];
            var14.append((char)(var11 ^ var10[var1 % var10.length]));
            0;
            ++var1;
            ++var6;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private void c(int n2) {
        int[] nArray = new int[llllllIlIlll[2]];
        nArray[m.llllllIlIlll[1]] = n2;
        if (m.lIIlIlIIIllllll(TileObjects.getNearest((int[])nArray))) {
            return;
        }
        int[] nArray2 = new int[llllllIlIlll[2]];
        nArray2[m.llllllIlIlll[1]] = n2;
        TileObjects.getNearest((int[])nArray2).interact(llllllIlIllI[llllllIlIlll[14]]);
    }

    private static boolean lIIlIlIIIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIIlllllI(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (m.lIIlIlIIIlllIlI(chatMessage.getMessage().equals(llllllIlIllI[llllllIlIlll[13]]) ? 1 : 0)) {
            this.F.a(this.F.d() + llllllIlIlll[2]);
        }
    }

    static {
        m.lIIlIlIIIlllIIl();
        m.lIIlIlIIIlllIII();
    }

    private static boolean lIIlIlIIIllllIl(Object object) {
        return object != null;
    }

    public boolean run() {
        m var15;
        if (m.lIIlIlIIIlllIlI(this.H.getVarbitValue(llllllIlIlll[0]))) {
            return llllllIlIlll[1];
        }
        int[] nArray = new int[llllllIlIlll[2]];
        nArray[m.llllllIlIlll[1]] = var15.G.foodID();
        if (!m.lIIlIlIIIlllIll(Inventory.getCount((int[])nArray), var15.G.minFoodAmount()) || m.lIIlIlIIIllllII(Inventory.getCount(item -> item.getName().startsWith(this.G.antiPoison())), var15.G.minAntiAmount())) {
            return llllllIlIlll[1];
        }
        int[] nArray2 = new int[llllllIlIlll[2]];
        nArray2[m.llllllIlIlll[1]] = llllllIlIlll[3];
        NPC var12 = NPCs.getNearest((int[])nArray2);
        if (m.lIIlIlIIIllllIl(var12)) {
            return llllllIlIlll[1];
        }
        if (m.lIIlIlIIIlllllI(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIlIlll[1];
        }
        String[] stringArray = new String[llllllIlIlll[2]];
        stringArray[m.llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[1]];
        TileObject var13 = TileObjects.getNearest((String[])stringArray);
        if (m.lIIlIlIIIllllIl(var13)) {
            String[] stringArray2 = new String[llllllIlIlll[2]];
            stringArray2[m.llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[2]];
            if (m.lIIlIlIIIlllIlI(var13.hasAction(stringArray2) ? 1 : 0)) {
                return llllllIlIlll[1];
            }
            String[] stringArray3 = new String[llllllIlIlll[2]];
            stringArray3[m.llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[4]];
            TileObjects.getNearest((String[])stringArray3).interact(llllllIlIllI[llllllIlIlll[5]]);
            return llllllIlIlll[2];
        }
        if (m.lIIlIlIIIlllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        String[] stringArray4 = new String[llllllIlIlll[2]];
        stringArray4[m.llllllIlIlll[1]] = llllllIlIllI[llllllIlIlll[6]];
        TileObject var16 = TileObjects.getNearest((String[])stringArray4);
        if (m.lIIlIlIIIllllll(var16)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llllllIlIlll[7], llllllIlIlll[8], llllllIlIlll[1]), (boolean)llllllIlIlll[1]);
            0;
            return llllllIlIlll[2];
        }
        int[] nArray3 = new int[llllllIlIlll[6]];
        nArray3[m.llllllIlIlll[1]] = llllllIlIlll[9];
        nArray3[m.llllllIlIlll[2]] = llllllIlIlll[10];
        nArray3[m.llllllIlIlll[4]] = llllllIlIlll[11];
        nArray3[m.llllllIlIlll[5]] = llllllIlIlll[12];
        int[] nArray4 = nArray3;
        this.c(nArray4[this.F.d()]);
        return llllllIlIlll[2];
    }

    @Inject
    public m(a a2, SquirePlunderConfig squirePlunderConfig, Client client) {
        this.F = a2;
        this.G = squirePlunderConfig;
        this.H = client;
    }

    private static boolean lIIlIlIIIlllIlI(int n2) {
        return n2 != 0;
    }
}

