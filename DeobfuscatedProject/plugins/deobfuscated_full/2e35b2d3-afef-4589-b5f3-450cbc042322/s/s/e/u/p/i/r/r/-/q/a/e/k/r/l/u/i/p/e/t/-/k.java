/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.DialogOption
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b;

/* TASK: Getting New Task -> GettingnewtaskTask */
@TaskDesc(name="Getting New Task")
public class k
extends Task {
    private final /* synthetic */ SquireSkipperPlugin F;
    private static /* synthetic */ String[] lIlIIlIIlIIII;
    private static /* synthetic */ int[] lIlIIlIIlIIll;
    private final /* synthetic */ SquireSkipperConfig G;

    static {
        k.lIlllIlIIllIIlI();
        k.lIlllIlIIlIllIl();
    }

    public boolean run() {
        k var4;
        if (k.lIlllIlIIllIllI(this.F.a(this.F.g()) ? 1 : 0)) {
            this.F.forceStop();
        }
        if (k.lIlllIlIIllIllI(var4.F.h() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        if (k.lIlllIlIIllIllI(Dialog.isOpen() ? 1 : 0) && (!k.lIlllIlIIllIlll(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[0]]) ? 1 : 0) || k.lIlllIlIIllIllI(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[1]]) ? 1 : 0))) {
            var4.F.a(lIlIIlIIlIIll[0]);
            Movement.setDestination((WorldPoint)Players.getLocal().getWorldLocation());
            return lIlIIlIIlIIll[1];
        }
        if (k.lIlllIlIIllIllI(Dialog.isOpen() ? 1 : 0) && k.lIlllIlIIllIllI(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[2]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[lIlIIlIIlIIll[3]];
            dialogOptionArray[k.lIlIIlIIlIIll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.lIlIIlIIlIIll[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.lIlIIlIIlIIll[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[k.lIlIIlIIlIIll[4]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[k.lIlIIlIIlIIll[5]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[k.lIlIIlIIlIIll[6]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return lIlIIlIIlIIll[1];
        }
        b var6 = var4.F.b();
        if (k.lIlllIlIIlllIIl((Object)var6) && k.lIlllIlIIllIlll(var4.F.c() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        var4.F.a(var4.F.g());
        0;
        NPC var1 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[lIlIIlIIlIIll[1]];
            stringArray[k.lIlIIlIIlIIll[0]] = lIlIIlIIlIIII[lIlIIlIIlIIll[5]];
            return nPC.hasAction(stringArray);
        });
        if (k.lIlllIlIIlllIIl(var1)) {
            var1.interact(lIlIIlIIlIIII[lIlIIlIIlIIll[4]]);
            return lIlIIlIIlIIll[1];
        }
        return lIlIIlIIlIIll[0];
    }

    private static String lIlllIlIIlIlIlI(String var7, String var18) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlIIll[7]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIlIIlIIlIIll[2], var16);
            return new String(var21.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    public k(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.F = squireSkipperPlugin;
        this.G = squireSkipperConfig;
    }

    private static String lIlllIlIIlIlIll(String var20, String var11) {
        var20 = new String(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var17 = var11.toCharArray();
        int var22 = lIlIIlIIlIIll[0];
        char[] var13 = var20.toCharArray();
        int var14 = var13.length;
        int var2 = lIlIIlIIlIIll[0];
        while (k.lIlllIlIIlllIlI(var2, var14)) {
            char var8 = var13[var2];
            var5.append((char)(var8 ^ var17[var22 % var17.length]));
            0;
            ++var22;
            ++var2;
            0;
            if ((0x4C ^ 0x48) > ((0x71 ^ 0x7F) & ~(0xCF ^ 0xC1))) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean lIlllIlIIlllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllIlIIlIllIl() {
        lIlIIlIIlIIII = new String[lIlIIlIIlIIll[6]];
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[0]] = k."task";
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[1]] = k."Come back";
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[2]] = k."still hunting";
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[4]] = k."Assignment";
        k.lIlIIlIIlIIII[k.lIlIIlIIlIIll[5]] = k."Assignment";
    }

    private static boolean lIlllIlIIllIlll(int n2) {
        return n2 == 0;
    }

    private static String lIlllIlIIlIllII(String var15, String var19) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(lIlIIlIIlIIll[2], var12);
            return new String(var9.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIllIllI(int n2) {
        return n2 != 0;
    }

    private static void lIlllIlIIllIIlI() {
        lIlIIlIIlIIll = new int[8];
        k.lIlIIlIIlIIll[0] = (0x9C ^ 0x81) & ~(0xDF ^ 0xC2);
        k.lIlIIlIIlIIll[1] = 1;
        k.lIlIIlIIlIIll[2] = 2;
        k.lIlIIlIIlIIll[3] = 112 + 12 - -1 + 52 ^ 127 + 102 - 65 + 19;
        k.lIlIIlIIlIIll[4] = 3;
        k.lIlIIlIIlIIll[5] = 0x3E ^ 0x3A;
        k.lIlIIlIIlIIll[6] = 0xB5 ^ 0xAA ^ (0x99 ^ 0x83);
        k.lIlIIlIIlIIll[7] = 0x58 ^ 0x50;
    }

    private static boolean lIlllIlIIlllIIl(Object object) {
        return object != null;
    }
}

