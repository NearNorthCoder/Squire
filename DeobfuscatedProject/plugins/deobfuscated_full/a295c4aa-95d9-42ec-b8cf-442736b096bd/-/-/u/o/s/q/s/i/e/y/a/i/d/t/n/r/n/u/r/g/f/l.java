/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
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
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Handing in sword -> HandinginswordTask */
@TaskDesc(name="Handing in sword", priority=10, blocking=true)
public class l
extends Task {
    private final /* synthetic */ a aa;
    private static /* synthetic */ int[] llIlIlllIIlI;
    private static /* synthetic */ String[] llIlIlllIIIl;

    public boolean run() {
        l var9;
        if (l.lIIIIIlllllIlll(this.aa.f() ? 1 : 0)) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIII((Object)var9.aa.k())) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llIlIlllIIlI[0];
        }
        if (l.lIIIIIllllllIIl(Dialog.getText().contains(llIlIlllIIIl[llIlIlllIIlI[0]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[llIlIlllIIlI[1]];
            dialogOptionArray[l.llIlIlllIIlI[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[2]] = DialogOption.PLAIN_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[3]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[l.llIlIlllIIlI[4]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[l.llIlIlllIIlI[5]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            return llIlIlllIIlI[2];
        }
        Player var8 = Players.getLocal();
        if (l.lIIIIIllllllIII(var8.getInteracting())) {
            return llIlIlllIIlI[0];
        }
        this.aa.a(llIlIlllIIIl[llIlIlllIIlI[2]]);
        0;
        this.sleep(llIlIlllIIlI[3]);
        return llIlIlllIIlI[2];
    }

    static {
        l.lIIIIIlllllIllI();
        l.lIIIIIlllllIlIl();
    }

    private static boolean lIIIIIllllllIII(Object object) {
        return object != null;
    }

    private static void lIIIIIlllllIllI() {
        llIlIlllIIlI = new int[7];
        l.llIlIlllIIlI[0] = (0xFB ^ 0x9A ^ (0xF ^ 0x37)) & (0xE8 ^ 0x93 ^ (0x34 ^ 0x16) ^ -1);
        l.llIlIlllIIlI[1] = 104 + 56 - -30 + 6 ^ 1 + 156 - 5 + 41;
        l.llIlIlllIIlI[2] = 1;
        l.llIlIlllIIlI[3] = 2;
        l.llIlIlllIIlI[4] = 3;
        l.llIlIlllIIlI[5] = 0xCF ^ 0x86 ^ (0x8A ^ 0xC7);
        l.llIlIlllIIlI[6] = 20 + 177 - 149 + 159 ^ 78 + 42 - -20 + 59;
    }

    private static String lIIIIIlllllIIll(String var12, String var5) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llIlIlllIIlI[3], var7);
            return new String(var10.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIlllllIlII(String var11, String var4) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llIlIlllIIlI[6]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(llIlIlllIIlI[3], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIlllllIlIl() {
        llIlIlllIIIl = new String[llIlIlllIIlI[3]];
        l.llIlIlllIIIl[l.llIlIlllIIlI[0]] = l."Hand over.";
        l.llIlIlllIIIl[l.llIlIlllIIlI[2]] = l."Hand-in";
    }

    @Inject
    public l(a a2) {
        this.aa = a2;
    }

    private static boolean lIIIIIllllllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlllllIlll(int n2) {
        return n2 == 0;
    }
}

