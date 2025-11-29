package a.u.i.p000.l.r.h.z.s.r.u.q.e;

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
@TaskDesc(name = "Eating for space", priority = Integer.MAX_VALUE, register = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.X  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/X.class */
public class X extends ad {
    private static /* synthetic */ int[] lIllIlIIIIIll;
    private static /* synthetic */ String[] lIllIlIIIIIlI;
    private /* synthetic */ boolean au;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        if (llIIIlllIlIIlIl(this.au ? 1 : 0)) {
            return lIllIlIIIIIll[0];
        }
        Inventory.getFirst(item -> {
            String str = lIllIlIIIIIlI[lIllIlIIIIIll[2]];
            return item.hasAction((v1) -> {
                return r1.equals(v1);
            });
        }).interact(lIllIlIIIIIlI[lIllIlIIIIIll[0]]);
        this.au = lIllIlIIIIIll[0];
        return lIllIlIIIIIll[1];
    }

    private static void llIIIlllIlIIIll() {
        lIllIlIIIIIlI = new String[lIllIlIIIIIll[3]];
        lIllIlIIIIIlI[lIllIlIIIIIll[0]] = llIIIlllIlIIIIl("JZ0qUXm77zs=", "vAbVK");
        lIllIlIIIIIlI[lIllIlIIIIIll[1]] = llIIIlllIlIIIlI("FCpcnzkIkNp8zWhIMf5QqMXyu5qO3IGL+DJOE8fudhykLpQ+1Qo3kciOxnYo7hPd", "oWnxh");
        lIllIlIIIIIlI[lIllIlIIIIIll[2]] = llIIIlllIlIIIlI("8WRxZdpE1/s=", "zIkou");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIIlllIlIIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) || llIIIlllIlIIlIl(chatMessage.getMessage().contains(lIllIlIIIIIlI[lIllIlIIIIIll[1]]) ? 1 : 0)) {
            return;
        }
        this.au = lIllIlIIIIIll[1];
    }

    static {
        llIIIlllIlIIlII();
        llIIIlllIlIIIll();
    }

    private static String llIIIlllIlIIIlI(String llllllllllllllIllIIlIIIIIIIlllII, String llllllllllllllIllIIlIIIIIIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIIIIIllIll.getBytes(StandardCharsets.UTF_8)), lIllIlIIIIIll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIIIIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIIIIIllIII) {
            llllllllllllllIllIIlIIIIIIIllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlllIlIIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected X(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
        this.au = lIllIlIIIIIll[0];
    }

    private static boolean llIIIlllIlIIlIl(int i) {
        return i == 0;
    }

    private static String llIIIlllIlIIIIl(String llllllllllllllIllIIlIIIIIIlIlIIl, String llllllllllllllIllIIlIIIIIIlIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIIIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIIIIIIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIIIIIIlIlIll.init(lIllIlIIIIIll[2], secretKeySpec);
            return new String(llllllllllllllIllIIlIIIIIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIIIIIlIlIlI) {
            llllllllllllllIllIIlIIIIIIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIIlllIlIIlII() {
        lIllIlIIIIIll = new int[5];
        lIllIlIIIIIll[0] = "  ".length() & ("  ".length() ^ (-1));
        lIllIlIIIIIll[1] = " ".length();
        lIllIlIIIIIll[2] = "  ".length();
        lIllIlIIIIIll[3] = "   ".length();
        lIllIlIIIIIll[4] = 64 ^ 72;
    }
}
