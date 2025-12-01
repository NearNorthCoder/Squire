package gg.squire.pvm;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import gg.squire.pvm.overlay.ShamanInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.A;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.B;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.i;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.k;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.l;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.m;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.n;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.o;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.p;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.q;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.r;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.s;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.t;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.u;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.v;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.w;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.x;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.y;
import s.h.p000.m.a.n.u.r.i.s.q.a.s.e.z;
@Extension
@PluginDescriptor(name = "Squire Shamans")
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:gg/squire/pvm/SquireShamansPlugin.class */
public class SquireShamansPlugin extends SquirePlugin {
    private /* synthetic */ boolean j;
    @Inject
    private /* synthetic */ i f;
    private static /* synthetic */ int[] lIIllIIIlIlIl;
    private /* synthetic */ boolean p;
    @Inject
    private /* synthetic */ ShamanInfoBox e;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ int h;
    private /* synthetic */ boolean l;
    private /* synthetic */ boolean m;
    private /* synthetic */ boolean n;
    @Inject
    private /* synthetic */ OverlayManager d;
    private /* synthetic */ int i;
    private /* synthetic */ Instant g;
    private /* synthetic */ int b;
    private /* synthetic */ boolean o;
    @Inject
    private /* synthetic */ SquireShamanConfig c;
    private /* synthetic */ boolean k;
    private static /* synthetic */ String[] lIIllIIIlIIlI;

    public void b(int i) {
        this.i = i;
    }

    private static void lIlIllllIIIIllI() {
        lIIllIIIlIlIl = new int[20];
        lIIllIIIlIlIl[0] = (32 ^ 25) ^ (102 ^ 77);
        lIIllIIIlIlIl[1] = " ".length() & (" ".length() ^ (-" ".length()));
        lIIllIIIlIlIl[2] = " ".length();
        lIIllIIIlIlIl[3] = "  ".length();
        lIIllIIIlIlIl[4] = "   ".length();
        lIIllIIIlIlIl[5] = (223 ^ 196) ^ (48 ^ 47);
        lIIllIIIlIlIl[6] = 140 ^ 137;
        lIIllIIIlIlIl[7] = (45 ^ 89) ^ (177 ^ 195);
        lIIllIIIlIlIl[8] = (102 ^ 72) ^ (167 ^ 142);
        lIIllIIIlIlIl[9] = (((117 + 2) - 57) + 68) ^ (((23 + 7) - (-71)) + 37);
        lIIllIIIlIlIl[10] = (((32 + 49) - (-31)) + 30) ^ (((51 + 120) - 82) + 46);
        lIIllIIIlIlIl[11] = (((120 + 204) - 135) + 18) ^ (((141 + 146) - 160) + 70);
        lIIllIIIlIlIl[12] = (((111 + 116) - 97) + 34) ^ (((122 + 160) - 164) + 57);
        lIIllIIIlIlIl[13] = (((69 + 53) - (-46)) + 14) ^ (((110 + 12) - 119) + 183);
        lIIllIIIlIlIl[14] = (122 ^ 105) ^ (103 ^ 121);
        lIIllIIIlIlIl[15] = 16 ^ 30;
        lIIllIIIlIlIl[16] = (((69 + 122) - 28) + 41) ^ (((39 + 108) - 137) + 185);
        lIIllIIIlIlIl[17] = (119 ^ 56) ^ (243 ^ 172);
        lIIllIIIlIlIl[18] = (((65 + 147) - 62) + 40) ^ (((94 + 135) - 111) + 57);
        lIIllIIIlIlIl[19] = -" ".length();
    }

    public int d() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIllllIIIIlll(chatMessage.getMessage().contains(lIIllIIIlIIlI[lIIllIIIlIlIl[2]]) ? 1 : 0)) {
            this.p = lIIllIIIlIlIl[2];
            Log.info(lIIllIIIlIIlI[lIIllIIIlIlIl[3]]);
            forceStop();
        }
    }

    public boolean i() {
        return this.n;
    }

    public boolean j() {
        return this.o;
    }

    public void f(boolean z) {
        this.o = z;
    }

    public Instant getStarted() {
        return this.g;
    }

    public void a(boolean z) {
        this.j = z;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllIIIlIlIl[0]];
        clsArr[lIIllIIIlIlIl[1]] = t.class;
        clsArr[lIIllIIIlIlIl[2]] = v.class;
        clsArr[lIIllIIIlIlIl[3]] = r.class;
        clsArr[lIIllIIIlIlIl[4]] = p.class;
        clsArr[lIIllIIIlIlIl[5]] = m.class;
        clsArr[lIIllIIIlIlIl[6]] = x.class;
        clsArr[lIIllIIIlIlIl[7]] = q.class;
        clsArr[lIIllIIIlIlIl[8]] = z.class;
        clsArr[lIIllIIIlIlIl[9]] = A.class;
        clsArr[lIIllIIIlIlIl[10]] = B.class;
        clsArr[lIIllIIIlIlIl[11]] = k.class;
        clsArr[lIIllIIIlIlIl[12]] = l.class;
        clsArr[lIIllIIIlIlIl[13]] = n.class;
        clsArr[lIIllIIIlIlIl[14]] = o.class;
        clsArr[lIIllIIIlIlIl[15]] = u.class;
        clsArr[lIIllIIIlIlIl[16]] = w.class;
        clsArr[lIIllIIIlIlIl[17]] = y.class;
        clsArr[lIIllIIIlIlIl[18]] = s.class;
        return clsArr;
    }

    public boolean h() {
        return this.m;
    }

    public int c() {
        return this.h;
    }

    public void c(boolean z) {
        this.l = z;
    }

    private static void lIlIllllIIIIlII() {
        lIIllIIIlIIlI = new String[lIIllIIIlIlIl[4]];
        lIIllIIIlIIlI[lIIllIIIlIlIl[1]] = lIlIlllIlllllII("6Rc0TfTdTD9oluFe7PsnhlA8TFXgVXxZ", "dyAde");
        lIIllIIIlIIlI[lIIllIIIlIlIl[2]] = lIlIllllIIIIIlI("Gy11EzM1N3lXLzswdRYkMWUxEjcw", "TEUwV");
        lIIllIIIlIIlI[lIIllIIIlIlIl[3]] = lIlIllllIIIIIll("lgTae0pWjwsCvB4yF8LFdy70+Ax4zptMRQYWuermiyN/hbw2XaEkpLTDPxiiwI3NSMCvDEqkrX0kKOh5EVMAYw==", "TRNgg");
    }

    private static String lIlIllllIIIIIlI(String llllllllllllllIllllIIlIIIIIIllll, String llllllllllllllIllllIIlIIIIIIlllI) {
        String llllllllllllllIllllIIlIIIIIIllll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIlIIIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIIlIIIIIIllIl = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIlIIIIIIlllI.toCharArray();
        int llllllllllllllIllllIIlIIIIIIIllI = lIIllIIIlIlIl[1];
        char[] charArray2 = llllllllllllllIllllIIlIIIIIIllll2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIIlIlIl[1];
        while (lIlIllllIIIlIII(i, length)) {
            char llllllllllllllIllllIIlIIIIIlIIII = charArray2[i];
            llllllllllllllIllllIIlIIIIIIllIl.append((char) (llllllllllllllIllllIIlIIIIIlIIII ^ charArray[llllllllllllllIllllIIlIIIIIIIllI % charArray.length]));
            "".length();
            llllllllllllllIllllIIlIIIIIIIllI++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIIlIIIIIIllIl);
    }

    public SquireShamanConfig b() {
        return this.c;
    }

    protected void onStop() {
        this.d.remove(this.e);
        "".length();
        this.d.remove(this.f);
        "".length();
        this.b = lIIllIIIlIlIl[1];
        this.i = lIIllIIIlIlIl[19];
    }

    public boolean g() {
        return this.l;
    }

    @Provides
    SquireShamanConfig a(ConfigManager configManager) {
        return (SquireShamanConfig) configManager.getConfig(SquireShamanConfig.class);
    }

    public int a() {
        return this.b;
    }

    private static String lIlIllllIIIIIll(String llllllllllllllIllllIIIlllllIllIl, String llllllllllllllIllllIIIlllllIllII) {
        try {
            SecretKeySpec llllllllllllllIllllIIIllllllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlllllIllII.getBytes(StandardCharsets.UTF_8)), lIIllIIIlIlIl[9]), "DES");
            Cipher llllllllllllllIllllIIIlllllIllll = Cipher.getInstance("DES");
            llllllllllllllIllllIIIlllllIllll.init(lIIllIIIlIlIl[3], llllllllllllllIllllIIIllllllIIII);
            return new String(llllllllllllllIllllIIIlllllIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIlllllIlllI) {
            llllllllllllllIllllIIIlllllIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlllIlllllII(String llllllllllllllIllllIIIlllllllIlI, String llllllllllllllIllllIIIlllllllIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIIIllllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIIlllllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIIIllllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIIIllllllllII.init(lIIllIIIlIlIl[3], llllllllllllllIllllIIIllllllllIl);
            return new String(llllllllllllllIllllIIIllllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIIlllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIIIlllllllIll) {
            llllllllllllllIllllIIIlllllllIll.printStackTrace();
            return null;
        }
    }

    public boolean f() {
        return this.k;
    }

    public void e(boolean z) {
        this.n = z;
    }

    static {
        lIlIllllIIIIllI();
        lIlIllllIIIIlII();
        a = LoggerFactory.getLogger(SquireShamansPlugin.class);
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIlIllllIIIIlll(this.p ? 1 : 0)) {
            forceStop();
        }
        if (lIlIllllIIIIlll(lIIllIIIlIIlI[lIIllIIIlIlIl[1]].equals(npcDespawned.getNpc().getName()) ? 1 : 0) && lIlIllllIIIIlll(this.c.room().x().contains(npcDespawned.getNpc().getWorldLocation()) ? 1 : 0) && lIlIllllIIIIlll(this.c.room().x().contains(Players.getLocal()) ? 1 : 0)) {
            this.b += lIIllIIIlIlIl[2];
        }
    }

    private static boolean lIlIllllIIIlIII(int i, int i2) {
        return i < i2;
    }

    protected void onStart() {
        a(lIIllIIIlIlIl[19]);
        this.d.add(this.e);
        "".length();
        this.d.add(this.f);
        "".length();
        this.g = Instant.now();
        this.i = Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId();
    }

    public void d(boolean z) {
        this.m = z;
    }

    public void b(boolean z) {
        this.k = z;
    }

    public void a(int i) {
        this.h = i;
    }

    private static boolean lIlIllllIIIIlll(int i) {
        return i != 0;
    }

    public boolean e() {
        return this.j;
    }
}
