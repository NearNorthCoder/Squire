package gg.squire.slayer;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.slayer.overlay.SkipperOverlay;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.b;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.c;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.d;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.e;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.f;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.g;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.h;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.i;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.j;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.k;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.l;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.m;
import s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001.n;
@Extension
@SquireUtil
@PluginDescriptor(name = "Squire Turael Skipper", tags = {"slayer", "task", "hunting"}, enabledByDefault = false)
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:gg/squire/slayer/SquireSkipperPlugin.class */
public class SquireSkipperPlugin extends SquirePlugin {
    private /* synthetic */ boolean h;
    private /* synthetic */ Instant f;
    private static final /* synthetic */ Pattern b;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ int j;
    private /* synthetic */ boolean o;
    @Inject
    private /* synthetic */ SkipperOverlay c;
    private /* synthetic */ boolean m;
    @Inject
    private /* synthetic */ SquireSkipperConfig d;
    private static /* synthetic */ int[] lIlIIlIIIllIl;
    private /* synthetic */ int n;
    private /* synthetic */ int k;
    @Inject
    private /* synthetic */ OverlayManager e;
    private /* synthetic */ boolean i;
    private static /* synthetic */ String[] lIlIIlIIIllII;
    private /* synthetic */ int l;
    private /* synthetic */ b g;

    public void d(boolean z) {
        this.o = z;
    }

    public boolean c() {
        return this.h;
    }

    private static String lIlllIlIIIllIIl(String llllllllllllllIllIllllIIIIIlIIlI, String llllllllllllllIllIllllIIIIIlIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIllllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllllIIIIIlIIII = new StringBuilder();
        char[] charArray = llllllllllllllIllIllllIIIIIlIIIl.toCharArray();
        int llllllllllllllIllIllllIIIIIIlllI = lIlIIlIIIllIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIIIllIl[1];
        while (lIlllIlIIlIIIlI(i, length)) {
            llllllllllllllIllIllllIIIIIlIIII.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIllllIIIIIIlllI % charArray.length]));
            "".length();
            llllllllllllllIllIllllIIIIIIlllI++;
            i++;
            "".length();
            if ((21 ^ 17) <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIllllIIIIIlIIII);
    }

    public static String a(String str, int i) {
        return str.substring(lIlIIlIIIllIl[1], str.length() - i);
    }

    @Provides
    SquireSkipperConfig a(ConfigManager configManager) {
        return (SquireSkipperConfig) configManager.getConfig(SquireSkipperConfig.class);
    }

    public void e(int i) {
        this.n = i;
    }

    public void b(int i) {
        this.j = i;
    }

    public static String a(String str) {
        return a(str, lIlIIlIIIllIl[0]);
    }

    private static boolean lIlllIlIIIllllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlllIlIIlIIIII(Object obj) {
        return obj == null;
    }

    public void d(int i) {
        this.l = i;
    }

    public int i() {
        return this.n;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public boolean d() {
        return this.i;
    }

    public void a(b bVar) {
        this.g = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlllIlIIIllllI(chatMessage.getType(), ChatMessageType.SPAM) && lIlllIlIIIllllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String removeTags = Text.removeTags(chatMessage.getMessage());
        if (lIlllIlIIIlllll(removeTags.contains(lIlIIlIIIllII[lIlIIlIIIllIl[1]]) ? 1 : 0)) {
            a((b) null);
            a((boolean) lIlIIlIIIllIl[0]);
            b(lIlIIlIIIllIl[1]);
        }
        if (lIlllIlIIIlllll(removeTags.contains(lIlIIlIIIllII[lIlIIlIIIllIl[0]]) ? 1 : 0)) {
            a((boolean) lIlIIlIIIllIl[0]);
            a((b) null);
            b(lIlIIlIIIllIl[1]);
            this.k += lIlIIlIIIllIl[0];
        }
        Matcher matcher = b.matcher(removeTags);
        if (lIlllIlIIIlllll(matcher.find() ? 1 : 0)) {
            b b2 = b.b(matcher.group(lIlIIlIIIllII[lIlIIlIIIllIl[2]]));
            if (lIlllIlIIlIIIII(b2)) {
                b((boolean) lIlIIlIIIllIl[0]);
                a((boolean) lIlIIlIIIllIl[0]);
                a((b) null);
                b(lIlIIlIIIllIl[1]);
                return;
            }
            b((boolean) lIlIIlIIIllIl[1]);
            int llllllllllllllIllIllllIIIIIlllll = Integer.parseInt(matcher.group(lIlIIlIIIllII[lIlIIlIIIllIl[3]]));
            b(llllllllllllllIllIllllIIIIIlllll);
            a(b2);
        }
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIIlIIIllIl[6]];
        clsArr[lIlIIlIIIllIl[1]] = h.class;
        clsArr[lIlIIlIIIllIl[0]] = e.class;
        clsArr[lIlIIlIIIllIl[2]] = k.class;
        clsArr[lIlIIlIIIllIl[3]] = d.class;
        clsArr[lIlIIlIIIllIl[7]] = c.class;
        clsArr[lIlIIlIIIllIl[8]] = l.class;
        clsArr[lIlIIlIIIllIl[9]] = f.class;
        clsArr[lIlIIlIIIllIl[10]] = g.class;
        clsArr[lIlIIlIIIllIl[11]] = n.class;
        clsArr[lIlIIlIIIllIl[5]] = j.class;
        clsArr[lIlIIlIIIllIl[4]] = m.class;
        clsArr[lIlIIlIIIllIl[12]] = i.class;
        return clsArr;
    }

    public boolean h() {
        return this.m;
    }

    private static boolean lIlllIlIIlIIIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIlllIlIIIllIlI(String llllllllllllllIllIlllIllllllIIII, String llllllllllllllIllIlllIlllllIllll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIllllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIllllllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIllllllIIlI.init(lIlIIlIIIllIl[2], llllllllllllllIllIlllIllllllIIll);
            return new String(llllllllllllllIllIlllIllllllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIllllllIIIl) {
            llllllllllllllIllIlllIllllllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIIIllIll(String llllllllllllllIllIlllIllllllllIl, String llllllllllllllIllIlllIllllllllII) {
        try {
            SecretKeySpec llllllllllllllIllIllllIIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIllllllllII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIllIl[11]), "DES");
            Cipher llllllllllllllIllIlllIllllllllll = Cipher.getInstance("DES");
            llllllllllllllIllIlllIllllllllll.init(lIlIIlIIIllIl[2], llllllllllllllIllIllllIIIIIIIIII);
            return new String(llllllllllllllIllIlllIllllllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIllllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlllllllllI) {
            llllllllllllllIllIlllIlllllllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIIlllll(int i) {
        return i != 0;
    }

    public int g() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    protected void onStop() {
        c(lIlIIlIIIllIl[1]);
        c((boolean) lIlIIlIIIllIl[1]);
        this.e.remove(this.c);
        "".length();
    }

    public void c(boolean z) {
        this.m = z;
    }

    public void b(boolean z) {
        this.i = z;
    }

    private static void lIlllIlIIIlllIl() {
        lIlIIlIIIllIl = new int[14];
        lIlIIlIIIllIl[0] = " ".length();
        lIlIIlIIIllIl[1] = ((((95 + 125) - 47) + 10) ^ (((60 + 47) - (-8)) + 76)) & (((168 ^ 157) ^ (163 ^ 158)) ^ (-" ".length()));
        lIlIIlIIIllIl[2] = "  ".length();
        lIlIIlIIIllIl[3] = "   ".length();
        lIlIIlIIIllIl[4] = (((102 + 34) - 66) + 63) ^ (((74 + 66) - 139) + 142);
        lIlIIlIIIllIl[5] = (1 ^ 89) ^ (95 ^ 14);
        lIlIIlIIIllIl[6] = 44 ^ 32;
        lIlIIlIIIllIl[7] = 32 ^ 36;
        lIlIIlIIIllIl[8] = (((3 + 109) - 17) + 84) ^ (((128 + 105) - 76) + 25);
        lIlIIlIIIllIl[9] = (((53 + 50) - 93) + 119) ^ (((105 + 68) - 136) + 98);
        lIlIIlIIIllIl[10] = (((89 + 10) - 79) + 175) ^ (((161 + 172) - 319) + 182);
        lIlIIlIIIllIl[11] = (((76 + 7) - 46) + 104) ^ (((4 + 73) - (-15)) + 41);
        lIlIIlIIIllIl[12] = 49 ^ 58;
        lIlIIlIIIllIl[13] = (-1649) & 2041;
    }

    private static boolean lIlllIlIIlIIIlI(int i, int i2) {
        return i < i2;
    }

    public Instant getStarted() {
        return this.f;
    }

    public int e() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    protected void onStart() {
        System.out.println(lIlIIlIIIllII[lIlIIlIIIllIl[7]]);
        this.g = null;
        this.f = Instant.now();
        this.i = lIlIIlIIIllIl[1];
        this.e.add(this.c);
        "".length();
        c(lIlIIlIIIllIl[1]);
        c((boolean) lIlIIlIIIllIl[1]);
        d((boolean) lIlIIlIIIllIl[1]);
        e(Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getId());
        System.out.println("Current Streak: " + a(lIlIIlIIIllIl[13]));
    }

    public b b() {
        return this.g;
    }

    public int f() {
        return this.k;
    }

    private static void lIlllIlIIIlllII() {
        lIlIIlIIIllII = new String[lIlIIlIIIllIl[9]];
        lIlIIlIIIllII[lIlIIlIIIllIl[1]] = lIlllIlIIIllIIl("Hz0lPyYEOyY9cgI3P3omA3IgLzwY", "lRHZR");
        lIlIIlIIIllII[lIlIIlIIIllIl[0]] = lIlllIlIIIllIIl("DS4ZPQkLNREpRRcuAT9FGiAHJg==", "nAtMe");
        lIlIIlIIIllII[lIlIIlIIIllIl[2]] = lIlllIlIIIllIlI("SC3GfHb9X0A=", "sRTOH");
        lIlIIlIIIllII[lIlIIlIIIllIl[3]] = lIlllIlIIIllIlI("QYYZQyWR+U4=", "YUuIH");
        lIlIIlIIIllII[lIlIIlIIIllIl[7]] = lIlllIlIIIllIll("QOcrI3Id+dZNrj2PCqYFnFmQ9QXOZri0ZwRGv9tt0B4=", "ucrza");
        lIlIIlIIIllII[lIlIIlIIIllIl[8]] = lIlllIlIIIllIIl("MlxIeD4DAVAwAkwVBDEOCxoSJkcYG1cpDgAYCxsIGVQfIxEJVAUnBAkdAScDTBVXLAIbVCQuBhURBWIGHwceJQkBERk2RwoGGC9HQl5Na0dES00ZMxgpHydHRUtffVsCFRonWUJfSGtPU05XalhWHRk+CAIIBC0SGBxXLQFFVF99XRgcEmJOU1xIfgsDFxY2DgMaSRk5Vylca05TXEh4XEwbGS4eTAhXHk9FXEh+BgEbAiwTUigTaU5ES01iCgMGEmITA1QQLTtCCCtrTkg=", "ltwBg");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean a(int i) {
        if (lIlllIlIIlIIIIl(i % lIlIIlIIIllIl[4], lIlIIlIIIllIl[5])) {
            ?? r0 = lIlIIlIIIllIl[0];
            "".length();
            return "  ".length() <= " ".length() ? ((128 ^ 133) ^ (44 ^ 29)) & (((41 ^ 120) ^ (114 ^ 23)) ^ (-" ".length())) : r0;
        }
        return lIlIIlIIIllIl[1];
    }

    public SquireSkipperConfig a() {
        return this.d;
    }

    public boolean j() {
        return this.o;
    }

    public void c(int i) {
        this.k = i;
    }

    static {
        lIlllIlIIIlllIl();
        lIlllIlIIIlllII();
        a = LoggerFactory.getLogger(SquireSkipperPlugin.class);
        b = Pattern.compile(lIlIIlIIIllII[lIlIIlIIIllIl[8]]);
    }
}
