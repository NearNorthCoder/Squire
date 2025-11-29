/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a_Unknown;
import e.t.r.i.s.h.q.n.r.u.-.u.e.EEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.HEnum;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

/* TASK: Hunting kebbits -> HuntingkebbitsTask */
@TaskDesc(name="Hunting kebbits", register=true)
public class HuntingKebbitsTask
extends j_Unknown {
    private static /* synthetic */ int[] lllIllllIllI;
    private static final /* synthetic */ RectangularArea B;
    private static final /* synthetic */ WorldPoint C;
    private /* synthetic */ boolean D;
    private static /* synthetic */ String[] lllIllllIIll;
    private /* synthetic */ int F;
    private /* synthetic */ int E;

    private static String lIIIlllIIIIIlII(String var25, String var1) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lllIllllIllI[11]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lllIllllIllI[1], var11);
            return new String(var22.doFinal(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    @Inject
    public o(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.FALCONRY);
        this.E = lllIllllIllI[0];
        this.F = lllIllllIllI[1];
    }

    private static boolean lIIIlllIIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private boolean C() {
        if (o.lIIIlllIIIIllll(Dialog.getText()) && o.lIIIlllIIIIlllI(Dialog.getText().contains(lllIllllIIll[lllIllllIllI[9]]) ? 1 : 0)) {
            this.D = lllIllllIllI[2];
            return lllIllllIllI[3];
        }
        if (o.lIIIlllIIIIlllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllIllllIllI[3];
        }
        if (o.lIIIlllIIIIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption(string -> string.contains(lllIllllIIll[lllIllllIllI[13]]));
            0;
            return lllIllllIllI[3];
        }
        String[] stringArray = new String[lllIllllIllI[3]];
        stringArray[o.lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[10]];
        NPC var23 = NPCs.getNearest((String[])stringArray);
        if (o.lIIIlllIIIIllll(var23)) {
            var23.interact(lllIllllIIll[lllIllllIllI[11]]);
            return lllIllllIllI[3];
        }
        if (o.lIIIlllIIIlIIIl(C.distanceTo((Locatable)Players.getLocal()), lllIllllIllI[7])) {
            Movement.walkTo((WorldPoint)C);
            0;
            return lllIllllIllI[3];
        }
        return lllIllllIllI[3];
    }

    @Override
    protected boolean x() {
        NPC var12;
        List var20;
        o var7;
        if (o.lIIIlllIIIIllIl((Object)this.z().method(), (Object)e.FALCONRY)) {
            return lllIllllIllI[2];
        }
        if (o.lIIIlllIIIIlllI(var7.D ? 1 : 0)) {
            return var7.C();
        }
        if (o.lIIIlllIIIIlllI(var7.B() ? 1 : 0)) {
            return lllIllllIllI[3];
        }
        if (o.lIIIlllIIIIlllI(var7.z().buryBones() ? 1 : 0)) {
            String[] stringArray = new String[lllIllllIllI[3]];
            stringArray[o.lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[2]];
            var20 = Inventory.getFirst((String[])stringArray);
            if (o.lIIIlllIIIIllll(var20)) {
                var20.interact(lllIllllIIll[lllIllllIllI[3]]);
            }
        }
        var20 = Inventory.getAll(item -> item.getName().contains(lllIllllIIll[lllIllllIllI[15]]));
        if (o.lIIIlllIIIlIIII(var7.z().buryBones() ? 1 : 0)) {
            String[] stringArray = new String[lllIllllIllI[3]];
            stringArray[o.lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[1]];
            var20.addAll(Inventory.getAll((String[])stringArray));
            0;
        }
        if (o.lIIIlllIIIlIIIl(var20.size(), var7.F)) {
            var7.F = Rand.nextInt((int)lllIllllIllI[3], (int)lllIllllIllI[4]);
            var20.forEach(item -> item.interact(lllIllllIIll[lllIllllIllI[14]]));
        }
        if (o.lIIIlllIIIIllll(var12 = Static.getClient().getHintArrowNpc())) {
            String[] stringArray = new String[lllIllllIllI[3]];
            stringArray[o.lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[5]];
            if (o.lIIIlllIIIIlllI(var12.hasAction(stringArray) ? 1 : 0)) {
                var12.interact(lllIllllIIll[lllIllllIllI[6]]);
                return lllIllllIllI[3];
            }
        }
        if (o.lIIIlllIIIlIIIl(B.getCenter().distanceTo((Locatable)Players.getLocal()), lllIllllIllI[7])) {
            Movement.setDestination((WorldPoint)B.getCenter());
            return lllIllllIllI[3];
        }
        NPC var4 = h.s();
        if (o.lIIIlllIIIIllll(var4)) {
            var4.interact(lllIllllIIll[lllIllllIllI[4]]);
            return lllIllllIllI[3];
        }
        return lllIllllIllI[3];
    }

    private static boolean lIIIlllIIIIlllI(int n2) {
        return n2 != 0;
    }

    private boolean B() {
        if (o.lIIIlllIIIlIIII(Movement.isRunEnabled() ? 1 : 0) && o.lIIIlllIIIlIIIl(Movement.getRunEnergy(), this.E)) {
            this.E = Rand.nextInt((int)lllIllllIllI[4], (int)lllIllllIllI[8]);
            Movement.toggleRun();
            return lllIllllIllI[3];
        }
        return lllIllllIllI[2];
    }

    private static String lIIIlllIIIIIIll(String var24, String var21) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var18 = var21.toCharArray();
        int var3 = lllIllllIllI[2];
        char[] var10 = var24.toCharArray();
        int var8 = var10.length;
        int var5 = lllIllllIllI[2];
        while (o.lIIIlllIIIlIIlI(var5, var8)) {
            char var6 = var10[var5];
            var2.append((char)(var6 ^ var18[var3 % var18.length]));
            0;
            ++var3;
            ++var5;
            0;
            if ((0x3D ^ 0x39) > 3) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIIIlllIIIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlllIIIIllII() {
        lllIllllIllI = new int[23];
        o.lllIllllIllI[0] = 0x69 ^ 0x7D;
        o.lllIllllIllI[1] = 2;
        o.lllIllllIllI[2] = (0xAF ^ 0xA4) & ~(0xD ^ 6);
        o.lllIllllIllI[3] = 1;
        o.lllIllllIllI[4] = 0x80 ^ 0x85;
        o.lllIllllIllI[5] = 3;
        o.lllIllllIllI[6] = 6 + 181 - 111 + 119 ^ 75 + 170 - 71 + 25;
        o.lllIllllIllI[7] = 0xDF ^ 0x9F ^ (0xDF ^ 0x95);
        o.lllIllllIllI[8] = 0x3C ^ 0x25;
        o.lllIllllIllI[9] = 0x3C ^ 0x3A;
        o.lllIllllIllI[10] = 0x42 ^ 0x45;
        o.lllIllllIllI[11] = 0x6E ^ 0x66;
        o.lllIllllIllI[12] = 13 + 38 - -150 + 4 ^ 124 + 33 - 61 + 100;
        o.lllIllllIllI[13] = 0x94 ^ 0x9F;
        o.lllIllllIllI[14] = 0x29 ^ 0x11 ^ (0x85 ^ 0xB1);
        o.lllIllllIllI[15] = 0x89 ^ 0x84;
        o.lllIllllIllI[16] = 0xFFFF897E & 0x7FBF;
        o.lllIllllIllI[17] = -(0xFFFFC175 & Short.MAX_VALUE) & (0xFFFFCFFF & 0x7F7E);
        o.lllIllllIllI[18] = 0xFFFFBBE6 & 0x4D5F;
        o.lllIllllIllI[19] = -(0xFFFFFDD7 & 0x73BF) & (0xFFFFFFF7 & 0x7F9F);
        o.lllIllllIllI[20] = -(0xFFFFA37F & 0x5EBB) & (0xFFFFAB7F & 0x5FFF);
        o.lllIllllIllI[21] = -(0xFFFFF1BB & 0x2E6E) & (0xFFFFEE7B & 0x3FBF);
        o.lllIllllIllI[22] = 62 + 41 - 62 + 96 ^ 55 + 132 - 167 + 115;
    }

    private static boolean lIIIlllIIIIllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var15;
        if (o.lIIIlllIIIIllIl(chatMessage.getType(), ChatMessageType.PUBLICCHAT) && o.lIIIlllIIIIlllI(chatMessage.getMessage().contains(lllIllllIIll[lllIllllIllI[12]]) ? 1 : 0)) {
            this.D = lllIllllIllI[3];
        }
        if (o.lIIIlllIIIIllIl(var15.getType(), ChatMessageType.PUBLICCHAT) && o.lIIIlllIIIIlllI(var15.getMessage().contains(lllIllllIIll[lllIllllIllI[7]]) ? 1 : 0)) {
            lllllllllllllllIIlIllIllllIlIIIl.D = lllIllllIllI[3];
        }
    }

    private static void lIIIlllIIIIlIII() {
        lllIllllIIll = new String[lllIllllIllI[22]];
        o.lllIllllIIll[o.lllIllllIllI[2]] = o."Bones";
        o.lllIllllIIll[o.lllIllllIllI[3]] = o."Bury";
        o.lllIllllIIll[o.lllIllllIllI[1]] = o."Bones";
        o.lllIllllIIll[o.lllIllllIllI[5]] = o."Retrieve";
        o.lllIllllIIll[o.lllIllllIllI[6]] = o."Retrieve";
        o.lllIllllIIll[o.lllIllllIllI[4]] = o."Catch";
        o.lllIllllIIll[o.lllIllllIllI[9]] = o."Right, try to be a bit more careful";
        o.lllIllllIIll[o.lllIllllIllI[10]] = o."Matthias";
        o.lllIllllIIll[o.lllIllllIllI[11]] = o."Talk-to";
        o.lllIllllIIll[o.lllIllllIllI[12]] = o."Your falcon has left";
        o.lllIllllIIll[o.lllIllllIllI[7]] = o."You try to catch the creature but it is too quick for you";
        o.lllIllllIIll[o.lllIllllIllI[13]] = o."Yes, please";
        o.lllIllllIIll[o.lllIllllIllI[14]] = o."Drop";
        o.lllIllllIIll[o.lllIllllIllI[15]] = o."fur";
    }

    private static boolean lIIIlllIIIIllIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        o.lIIIlllIIIIllII();
        o.lIIIlllIIIIlIII();
        B = new RectangularArea(new WorldPoint(lllIllllIllI[16], lllIllllIllI[17], lllIllllIllI[2]), new WorldPoint(lllIllllIllI[18], lllIllllIllI[19], lllIllllIllI[2]));
        C = new WorldPoint(lllIllllIllI[20], lllIllllIllI[21], lllIllllIllI[2]);
    }

    private static String lIIIlllIIIIIIII(String var19, String var9) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lllIllllIllI[1], var13);
            return new String(var14.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }
}

