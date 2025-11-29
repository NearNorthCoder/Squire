/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

/* TASK: Opening sarcophagus -> OpeningsarcophagusTask */
@TaskDesc(name="Opening sarcophagus", priority=250, blocking=true)
public class o
extends Task {
    private static /* synthetic */ String[] llllIIlIIIl;
    private static /* synthetic */ int[] llllIIlIIlI;
    private final /* synthetic */ SquireBarrows V;

    private static String lIllIIlllllllI(String var7, String var21) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llllIIlIIlI[2], var13);
            return new String(var15.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIIIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllIlIIIIIIII() {
        llllIIlIIlI = new int[7];
        o.llllIIlIIlI[0] = 1;
        o.llllIIlIIlI[1] = 2 & (2 ^ -1);
        o.llllIIlIIlI[2] = 2;
        o.llllIIlIIlI[3] = 0x48 ^ 0x2F ^ (0x3D ^ 0x5F);
        o.llllIIlIIlI[4] = 0x74 ^ 0x72;
        o.llllIIlIIlI[5] = 3;
        o.llllIIlIIlI[6] = 5 ^ 0x4E ^ (0x2E ^ 0x6D);
    }

    private static boolean lIllIlIIIIlIII(Object object) {
        return object != null;
    }

    private static String lIllIIllllllIl(String var3, String var6) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llllIIlIIlI[6]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llllIIlIIlI[2], var10);
            return new String(var14.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean M() {
        String[] stringArray = new String[llllIIlIIlI[0]];
        stringArray[o.llllIIlIIlI[1]] = llllIIlIIIl[llllIIlIIlI[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIlIIIIIIIl(tileObject)) {
            return llllIIlIIlI[1];
        }
        String[] stringArray2 = new String[llllIIlIIlI[2]];
        stringArray2[o.llllIIlIIlI[1]] = llllIIlIIIl[llllIIlIIlI[0]];
        stringArray2[o.llllIIlIIlI[0]] = llllIIlIIIl[llllIIlIIlI[2]];
        tileObject.interact(stringArray2);
        return llllIIlIIlI[0];
    }

    private static boolean lIllIlIIIIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIlIIIIIlIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        o.lIllIlIIIIIIII();
        o.lIllIIllllllll();
    }

    private static boolean lIllIlIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIIIIIIIl(Object object) {
        return object == null;
    }

    public boolean run() {
        o var4;
        if (o.lIllIlIIIIIIlI(this.V.h() ? 1 : 0)) {
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
            var4.V.k();
            if (o.lIllIlIIIIIlII(var4.V.e(), llllIIlIIlI[3])) {
                DialogOption[] dialogOptionArray = new DialogOption[llllIIlIIlI[2]];
                dialogOptionArray[o.llllIIlIIlI[1]] = DialogOption.PLAIN_CONTINUE;
                dialogOptionArray[o.llllIIlIIlI[0]] = DialogOption.CHAT_OPTION_ONE;
                Dialog.invokeDialog((DialogOption[])dialogOptionArray);
                return llllIIlIIlI[0];
            }
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIIll(var4.V.i() ? 1 : 0) && o.lIllIlIIIIIlIl(var4.V.e(), llllIIlIIlI[4])) {
            return llllIIlIIlI[1];
        }
        if (o.lIllIlIIIIIllI((Object)var4.V.r(), (Object)var4.V.s()) && o.lIllIlIIIIIlll(var4.V.e(), llllIIlIIlI[3])) {
            return llllIIlIIlI[1];
        }
        NPC var16 = NPCs.getNearest(d::a);
        if (o.lIllIlIIIIlIII(var16) && o.lIllIlIIIIIllI(var16.getInteracting(), Players.getLocal())) {
            return llllIIlIIlI[1];
        }
        return o.M();
    }

    @Inject
    public o(SquireBarrows squireBarrows) {
        this.V = squireBarrows;
    }

    private static void lIllIIllllllll() {
        llllIIlIIIl = new String[llllIIlIIlI[5]];
        o.llllIIlIIIl[o.llllIIlIIlI[1]] = o."Sarcophagus";
        o.llllIIlIIIl[o.llllIIlIIlI[0]] = o."Search";
        o.llllIIlIIIl[o.llllIIlIIlI[2]] = o."Open";
    }

    private static boolean lIllIlIIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static String lIllIIllllllII(String var9, String var20) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var18 = var20.toCharArray();
        int var12 = llllIIlIIlI[1];
        char[] var1 = var9.toCharArray();
        int var5 = var1.length;
        int var2 = llllIIlIIlI[1];
        while (o.lIllIlIIIIIlll(var2, var5)) {
            char var17 = var1[var2];
            var8.append((char)(var17 ^ var18[var12 % var18.length]));
            0;
            ++var12;
            ++var2;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }
}

