/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Inventory;

/* TASK: Eating for space -> EatingforspaceTask */
@TaskDesc(name="Eating for space", priority=0x7FFFFFFF, register=true)
public class EatingForSpaceTask
extends ad_Unknown {
    private static /* synthetic */ int[] lIllIlIIIIIll;
    private static /* synthetic */ String[] lIllIlIIIIIlI;
    private /* synthetic */ boolean au;

    @Override
    public boolean ac() {
        if (X.llIIIlllIlIIlIl(this.au ? 1 : 0)) {
            return lIllIlIIIIIll[0];
        }
        Inventory.getFirst(item -> item.hasAction(lIllIlIIIIIlI[lIllIlIIIIIll[2]]::equals)).interact(lIllIlIIIIIlI[lIllIlIIIIIll[0]]);
        this.au = lIllIlIIIIIll[0];
        return lIllIlIIIIIll[1];
    }

    private static void llIIIlllIlIIIll() {
        lIllIlIIIIIlI = new String[lIllIlIIIIIll[3]];
        X.lIllIlIIIIIlI[X.lIllIlIIIIIll[0]] = X."Eat";
        X.lIllIlIIIIIlI[X.lIllIlIIIIIll[1]] = X."You don't have enough free inventory space";
        X.lIllIlIIIIIlI[X.lIllIlIIIIIll[2]] = X."Eat";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var8;
        if (X.llIIIlllIlIIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (X.llIIIlllIlIIlIl(var8.getMessage().contains(lIllIlIIIIIlI[lIllIlIIIIIll[1]]) ? 1 : 0)) {
            return;
        }
        this.au = lIllIlIIIIIll[1];
    }

    static {
        X.llIIIlllIlIIlII();
        X.llIIIlllIlIIIll();
    }

    private static String llIIIlllIlIIIlI(String var9, String var11) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIIll[4]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIllIlIIIIIll[2], var6);
            return new String(var5.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlllIlIIllI(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    protected X(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
        this.au = lIllIlIIIIIll[0];
    }

    private static boolean llIIIlllIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static String llIIIlllIlIIIIl(String var4, String var1) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIllIlIIIIIll[2], var2);
            return new String(var10.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static void llIIIlllIlIIlII() {
        lIllIlIIIIIll = new int[5];
        X.lIllIlIIIIIll[0] = 2 & ~2;
        X.lIllIlIIIIIll[1] = 1;
        X.lIllIlIIIIIll[2] = 2;
        X.lIllIlIIIIIll[3] = 3;
        X.lIllIlIIIIIll[4] = 0x40 ^ 0x48;
    }
}

