package gg.squire.account;

import com.google.inject.Provides;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0004e;
import l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0016q;
import l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0024y;
import l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.N;
import l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W;
import l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.al;
import l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.an;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import org.pf4j.Extension;
@Extension
@PluginDescriptor(name = "Squire Easy Clue Builder", enabledByDefault = false)
@SquireUtil
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:gg/squire/account/AccBuilderEasyClues.class */
public class AccBuilderEasyClues extends Script {
    @Inject
    public /* synthetic */ BuilderConfig q;
    public static /* synthetic */ long b;
    @Inject
    private /* synthetic */ Client u;
    private static /* synthetic */ W[] p;
    public static /* synthetic */ int f;
    private static /* synthetic */ String[] llIIIIIlI;
    /* synthetic */ boolean t;
    public static /* synthetic */ String h;
    public static /* synthetic */ String j;
    @Inject
    private /* synthetic */ BuilderInfoBox w;
    static /* synthetic */ String o;
    @Inject
    private /* synthetic */ OverlayManager v;
    public static /* synthetic */ String c;
    public static /* synthetic */ long g;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    public static /* synthetic */ String k;
    private static /* synthetic */ int[] llIIIIIll;

    /* renamed from: l  reason: collision with root package name */
    public static /* synthetic */ String f2l;
    static /* synthetic */ int n;
    public static /* synthetic */ List<W> a;
    public static /* synthetic */ String m;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ boolean d;
    /* synthetic */ WorldArea r = new WorldArea(llIIIIIll[0], llIIIIIll[1], llIIIIIll[2], llIIIIIll[3], llIIIIIll[4]);
    /* synthetic */ String s = llIIIIIlI[llIIIIIll[4]];

    private static boolean lIlIIIlIllll(int i2) {
        return i2 <= 0;
    }

    private static boolean lIlIIIlIlIll(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlIIIlIIIll(String lIlllllIIIlIIl, String lIlllllIIIlIII) {
        String lIlllllIIIlIIl2 = new String(Base64.getDecoder().decode(lIlllllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllllIIIIlll = new StringBuilder();
        char[] charArray = lIlllllIIIlIII.toCharArray();
        int lIlllllIIIIlIl = llIIIIIll[4];
        char[] charArray2 = lIlllllIIIlIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = llIIIIIll[4];
        while (lIlIIIllIIlI(i2, length)) {
            lIlllllIIIIlll.append((char) (charArray2[i2] ^ charArray[lIlllllIIIIlIl % charArray.length]));
            "".length();
            lIlllllIIIIlIl++;
            i2++;
            "".length();
            if (((((128 + 99) - 168) + 107) ^ (((127 + 21) - 60) + 74)) == 0) {
                return null;
            }
        }
        return String.valueOf(lIlllllIIIIlll);
    }

    private static boolean lIlIIIlIlIIl(Object obj) {
        return obj == null;
    }

    private static String lIlIIIlIIIlI(String lIlllllIlIIllI, String lIlllllIlIIlIl) {
        try {
            SecretKeySpec lIlllllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), llIIIIIll[18]), "DES");
            Cipher lIlllllIlIlIII = Cipher.getInstance("DES");
            lIlllllIlIlIII.init(llIIIIIll[9], lIlllllIlIlIIl);
            return new String(lIlllllIlIlIII.doFinal(Base64.getDecoder().decode(lIlllllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllllIlIIlll) {
            lIlllllIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIlll(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    static {
        lIlIIIlIIlIl();
        lIlIIIlIIlII();
        a = new ArrayList();
        b = System.currentTimeMillis();
        d = llIIIIIll[4];
        g = System.currentTimeMillis();
        h = llIIIIIlI[llIIIIIll[49]];
        i = new HashMap<>();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        W[] wArr = new W[llIIIIIll[5]];
        wArr[llIIIIIll[4]] = new an();
        p = wArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (lIlIIIlIlIlI(configChanged.getGroup().equalsIgnoreCase(llIIIIIlI[llIIIIIll[19]]) ? 1 : 0) && lIlIIIlIlIlI(configChanged.getKey().contains(llIIIIIlI[llIIIIIll[20]]) ? 1 : 0)) {
            this.t = this.q.turnScriptOnOff();
            if (!lIlIIIlIlIlI(this.t ? 1 : 0)) {
                d = llIIIIIll[5];
                return;
            }
            d = llIIIIIll[4];
            "".length();
            if (0 != 0) {
            }
        }
    }

    private static boolean lIlIIIlIllII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIIIlIllIl(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIIllIIlI(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i2, int i3, Player player) {
        int combatLevel = player.getCombatLevel();
        int i4 = i3 + i2;
        if (lIlIIIlIlllI(combatLevel, i3 - i2) && lIlIIIlIllIl(combatLevel, i4)) {
            ?? r0 = llIIIIIll[5];
            "".length();
            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIIIll[4];
    }

    private static boolean lIlIIIlIlIlI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIIllIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIIIlIlllI(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIIlIlIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIIIlIlIlI(chatMessage.getMessage().contains(llIIIIIlI[llIIIIIll[29]]) ? 1 : 0)) {
            System.out.println(llIIIIIlI[llIIIIIll[30]]);
            d = llIIIIIll[5];
        }
        if (lIlIIIlIlIlI(chatMessage.getMessage().contains(llIIIIIlI[llIIIIIll[31]]) ? 1 : 0)) {
            System.out.println(llIIIIIlI[llIIIIIll[32]]);
            if (lIlIIIlIIlll(Game.getWildyLevel()) && lIlIIIlIIlll(Inventory.contains(item -> {
                return item.getName().contains(llIIIIIlI[llIIIIIll[48]]);
            }) ? 1 : 0)) {
                d = llIIIIIll[5];
                System.out.println(llIIIIIlI[llIIIIIll[22]]);
            }
            if (!lIlIIIlIllll(Game.getWildyLevel()) || lIlIIIlIlIlI(Inventory.contains(item2 -> {
                return item2.getName().contains(llIIIIIlI[llIIIIIll[47]]);
            }) ? 1 : 0)) {
                d = llIIIIIll[4];
                System.out.println(llIIIIIlI[llIIIIIll[33]]);
            }
        }
        if (lIlIIIlIlIlI(chatMessage.getMessage().contains(llIIIIIlI[llIIIIIll[34]]) ? 1 : 0) && lIlIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(N.jj), llIIIIIll[20])) {
            String[] strArr = new String[llIIIIIll[5]];
            strArr[llIIIIIll[4]] = llIIIIIlI[llIIIIIll[35]];
            if (lIlIIIlIlIII(TileObjects.getNearest(strArr))) {
                String[] strArr2 = new String[llIIIIIll[5]];
                strArr2[llIIIIIll[4]] = llIIIIIlI[llIIIIIll[36]];
                TileObjects.getNearest(strArr2).interact(llIIIIIlI[llIIIIIll[37]]);
                Time.sleepTicks(llIIIIIll[11]);
                "".length();
            }
            String[] strArr3 = new String[llIIIIIll[5]];
            strArr3[llIIIIIll[4]] = llIIIIIlI[llIIIIIll[38]];
            if (lIlIIIlIlIII(TileObjects.getNearest(strArr3))) {
                String[] strArr4 = new String[llIIIIIll[5]];
                strArr4[llIIIIIll[4]] = llIIIIIlI[llIIIIIll[39]];
                TileObjects.getNearest(strArr4).interact(llIIIIIlI[llIIIIIll[40]]);
                Time.sleepTicks(llIIIIIll[10]);
                "".length();
            }
        }
        if (lIlIIIlIlIlI(chatMessage.getMessage().contains(llIIIIIlI[llIIIIIll[41]]) ? 1 : 0)) {
            Movement.walkTo(new WorldPoint(llIIIIIll[42], llIIIIIll[43], llIIIIIll[4]));
            "".length();
            Time.sleepTicks(llIIIIIll[5]);
            "".length();
        }
        if (lIlIIIlIlIlI(chatMessage.getMessage().contains(llIIIIIlI[llIIIIIll[44]]) ? 1 : 0)) {
            int[] iArr = new int[llIIIIIll[5]];
            iArr[llIIIIIll[4]] = llIIIIIll[45];
            if (lIlIIIlIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIIll[5]];
                iArr2[llIIIIIll[4]] = llIIIIIll[45];
                Inventory.getFirst(iArr2).interact(llIIIIIlI[llIIIIIll[46]]);
            }
        }
    }

    private static boolean lIlIIIlIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIIIlIIlII() {
        llIIIIIlI = new String[llIIIIIll[50]];
        llIIIIIlI[llIIIIIll[4]] = lIlIIIlIIIIl("oN1Pkuq+Qje2iULFPsM7FoNe+280Ho/rm6Gzfu+VwdWXmeVqHnl6EsbGvwz8KdNIzkCBmopNkZR7TUw/1fjqNplAX7tMGm5O0/zSj5wPNadDSTVgVto+64vUE0ezaLxdZ9brrBtjdYVRTG9rLLpBwc+i3vrlSlwEYdBBfxlGqx0=", "yPOFP");
        llIIIIIlI[llIIIIIll[5]] = lIlIIIlIIIIl("sQOBq94rz14=", "sPmKm");
        llIIIIIlI[llIIIIIll[9]] = lIlIIIlIIIlI("xSfGGB5tsHqQnxSy3qVjGWyiAnrzgZIj", "CHagy");
        llIIIIIlI[llIIIIIll[10]] = lIlIIIlIIIIl("SkC7IGMzzBNtMaegDBFLgkR1ZgoFOoFL", "RNOSd");
        llIIIIIlI[llIIIIIll[11]] = lIlIIIlIIIll("Fw8/OBE5AzVxAzIFPiQMJQ==", "QfQQb");
        llIIIIIlI[llIIIIIll[14]] = lIlIIIlIIIlI("Jy5GQ043uhBR4pwIfC9Zsw==", "STLFW");
        llIIIIIlI[llIIIIIll[16]] = lIlIIIlIIIll("WRYiIwI0JBwSVwMhBygePW0BOxYhORshEHM4AkU=", "SMrOw");
        llIIIIIlI[llIIIIIll[17]] = lIlIIIlIIIIl("XID+R1VyMV/tXsPZ4TxIEg==", "BxSkk");
        llIIIIIlI[llIIIIIll[18]] = lIlIIIlIIIlI("dBYvnoaGNmPtHZIq+FDWvrYc/1Nh8Qun8SKszcTMLMmLO5nXXAiOY34EcC95g0nP", "FUhMB");
        llIIIIIlI[llIIIIIll[19]] = lIlIIIlIIIIl("0oKlTtXvj+P3IxYGWpHxKg==", "kUMRn");
        llIIIIIlI[llIIIIIll[20]] = lIlIIIlIIIIl("cNE1r2M2CBM=", "bSqyG");
        llIIIIIlI[llIIIIIll[21]] = lIlIIIlIIIll("bSIyPhsAEAwPTjcVFzUHCVkROhsTWQY9GQlz", "gybRn");
        llIIIIIlI[llIIIIIll[25]] = lIlIIIlIIIll("FiAhFkIWLShaCQsrKg==", "bEMzb");
        llIIIIIlI[llIIIIIll[26]] = lIlIIIlIIIll("Jx0iMzsjAW0kPzMWbTQwNBwhKw==", "FsMGS");
        llIIIIIlI[llIIIIIll[27]] = lIlIIIlIIIIl("hOBpYrBEvyAdi7vWBy1aVg==", "XWoCj");
        llIIIIIlI[llIIIIIll[28]] = lIlIIIlIIIIl("B7okjSbeuaUcYsOWvz2P0AlmT0tk/Y90qIZrEBMelDG7zslWXAxvuA==", "hbyIJ");
        llIIIIIlI[llIIIIIll[29]] = lIlIIIlIIIIl("47RH2N/4boccSwmk4U8tyaxq1GccVwya", "yhLTk");
        llIIIIIlI[llIIIIIll[30]] = lIlIIIlIIIlI("vsI5MAWprku86JeIZqoGThNCtaihM2TfqGTwhl8uE/Y=", "QoyCL");
        llIIIIIlI[llIIIIIll[31]] = lIlIIIlIIIIl("eExhSzqGfSjRIMvUjFWYEpgf4efTSkD/", "UsnIo");
        llIIIIIlI[llIIIIIll[32]] = lIlIIIlIIIIl("+5Vt8cJevyyTZ1KBHklLzw==", "LNgpM");
        llIIIIIlI[llIIIIIll[22]] = lIlIIIlIIIlI("FjDn5QsPkBT88pfPkjXcsfCtVE5iziKasLnzK/aAt47a4Av4Mjom6esvHSeu0R212yu+/bx69aCXFCPh9USrRipaAoo0jtlXtyAnh7VQOHpTrU9hPQSjiQ==", "usJNb");
        llIIIIIlI[llIIIIIll[33]] = lIlIIIlIIIll("JyRpJwIVJWknHgIoJyRLHzNpIg0EJDtjGwIgMCYZXGE6KwQFLS1jCRVhKiwFBCgnNgIeJmkwCAIoOTdHUDMsMwQCNWkqDVA4JjZLAyQsYx8YKDpjCh4laSofUDYoMAVXNWknHgIoJyRLHzNpMQIXKT1jChY1LDFLADMoOg4C", "pAICk");
        llIIIIIlI[llIIIIIll[34]] = lIlIIIlIIIlI("4fQtnbkynepKJVrW8AmatUP0lPC8HZHw", "AXDav");
        llIIIIIlI[llIIIIIll[35]] = lIlIIIlIIIIl("H4xI5/OY+yY=", "hrjmj");
        llIIIIIlI[llIIIIIll[36]] = lIlIIIlIIIll("Lyw6GA==", "kCUjZ");
        llIIIIIlI[llIIIIIll[37]] = lIlIIIlIIIIl("lM19falsWck=", "GFNev");
        llIIIIIlI[llIIIIIll[38]] = lIlIIIlIIIll("IBAUK3YwDR48", "tbqNV");
        llIIIIIlI[llIIIIIll[39]] = lIlIIIlIIIll("PCgRAnAsNRsV", "hZtgP");
        llIIIIIlI[llIIIIIll[40]] = lIlIIIlIIIlI("/LrAlgOoVF4=", "pmLnR");
        llIIIIIlI[llIIIIIll[41]] = lIlIIIlIIIIl("Pa3NQnpBttOBCR7m9eieJfcPnrrRKIZW", "AXWHD");
        llIIIIIlI[llIIIIIll[44]] = lIlIIIlIIIIl("pf0gRB7afz3a4jzsMkco1H5uG3uBlwha", "NvHkU");
        llIIIIIlI[llIIIIIll[46]] = lIlIIIlIIIIl("k5RH4CAUBYg=", "KlQDU");
        llIIIIIlI[llIIIIIll[47]] = lIlIIIlIIIll("OyYHNzAXNA==", "ySuYY");
        llIIIIIlI[llIIIIIll[48]] = lIlIIIlIIIIl("kK4uAebrZM0=", "gLiva");
        llIIIIIlI[llIIIIIll[49]] = lIlIIIlIIIlI("TUGJ9VHJwpU=", "OMLzy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public void onStart(String... strArr) {
        SquirePlugin.setGlobalMouseRecordings();
        "".length();
        d = llIIIIIll[4];
        System.out.print(llIIIIIlI[llIIIIIll[16]]);
        this.v.add(this.w);
        "".length();
        o = llIIIIIlI[llIIIIIll[17]];
        a.clear();
        System.out.println(llIIIIIlI[llIIIIIll[18]]);
        a.clear();
        List<W> list = a;
        C0016q[] c0016qArr = new C0016q[llIIIIIll[5]];
        c0016qArr[llIIIIIll[4]] = new C0016q();
        Collections.addAll(list, c0016qArr);
        "".length();
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig) configManager.getConfig(BuilderConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    protected void shutDown() {
        this.v.remove(this.w);
        "".length();
        d = llIIIIIll[5];
        p = new W[llIIIIIll[4]];
        n = llIIIIIll[4];
        f = llIIIIIll[4];
        System.out.print(llIIIIIlI[llIIIIIll[21]]);
        super.stop();
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        if (!lIlIIIllIIII(loginStateChanged.getIndex(), llIIIIIll[27]) && lIlIIIlIIlll(n)) {
            C0004e.a(this.s, "rsn: " + k + " account has been banned? - Acc builder " + o);
            n += llIIIIIll[5];
        }
    }

    private static String lIlIIIlIIIIl(String lIlllllIIllIIl, String lIlllllIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllllIIllIll = Cipher.getInstance("Blowfish");
            lIlllllIIllIll.init(llIIIIIll[9], secretKeySpec);
            return new String(lIlllllIIllIll.doFinal(Base64.getDecoder().decode(lIlllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllllIIllIlI) {
            lIlllllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIlIIlIl() {
        llIIIIIll = new int[51];
        llIIIIIll[0] = (-((-22531) & 22875)) & (-20609) & 24063;
        llIIIIIll[1] = (-28779) & 32378;
        llIIIIIll[2] = 101 ^ 91;
        llIIIIIll[3] = 64 ^ 117;
        llIIIIIll[4] = (68 ^ 23) & ((62 ^ 109) ^ (-1));
        llIIIIIll[5] = " ".length();
        llIIIIIll[6] = 214 ^ 178;
        llIIIIIll[7] = (-((-16673) & 23397)) & (-35) & 7039;
        llIIIIIll[8] = (-23553) & 24552;
        llIIIIIll[9] = "  ".length();
        llIIIIIll[10] = "   ".length();
        llIIIIIll[11] = (((5 + 109) - 73) + 130) ^ (((145 + 138) - 187) + 79);
        llIIIIIll[12] = (-1813) & 12277;
        llIIIIIll[13] = (-((-7479) & 16183)) & (-6146) & 16349;
        llIIIIIll[14] = (148 ^ 133) ^ (37 ^ 49);
        llIIIIIll[15] = (-12323) & 12922;
        llIIIIIll[16] = 53 ^ 51;
        llIIIIIll[17] = (239 ^ 177) ^ (93 ^ 4);
        llIIIIIll[18] = (99 ^ 47) ^ (6 ^ 66);
        llIIIIIll[19] = (215 ^ 162) ^ (71 ^ 59);
        llIIIIIll[20] = (116 ^ 40) ^ (22 ^ 64);
        llIIIIIll[21] = 165 ^ 174;
        llIIIIIll[22] = (183 ^ 150) ^ (12 ^ 57);
        llIIIIIll[23] = (-136) & 671;
        llIIIIIll[24] = (-18725) & 19261;
        llIIIIIll[25] = 103 ^ 107;
        llIIIIIll[26] = 189 ^ 176;
        llIIIIIll[27] = 5 ^ 11;
        llIIIIIll[28] = (((97 + 90) - 115) + 56) ^ (((94 + 140) - 106) + 15);
        llIIIIIll[29] = 0 ^ 16;
        llIIIIIll[30] = (3 ^ 94) ^ (86 ^ 26);
        llIIIIIll[31] = (14 ^ 51) ^ (83 ^ 124);
        llIIIIIll[32] = 40 ^ 59;
        llIIIIIll[33] = 64 ^ 85;
        llIIIIIll[34] = (((27 + 137) - 31) + 5) ^ (((64 + 144) - 192) + 140);
        llIIIIIll[35] = 157 ^ 138;
        llIIIIIll[36] = 95 ^ 71;
        llIIIIIll[37] = 8 ^ 17;
        llIIIIIll[38] = (38 ^ 1) ^ (122 ^ 71);
        llIIIIIll[39] = (169 ^ 133) ^ (41 ^ 30);
        llIIIIIll[40] = 146 ^ 142;
        llIIIIIll[41] = 133 ^ 152;
        llIIIIIll[42] = (-((-3321) & 31993)) & (-1029) & 32677;
        llIIIIIll[43] = (-321) & 3559;
        llIIIIIll[44] = 82 ^ 76;
        llIIIIIll[45] = (-((-20785) & 32561)) & (-4097) & 16303;
        llIIIIIll[46] = 62 ^ 33;
        llIIIIIll[47] = (105 ^ 52) ^ (48 ^ 77);
        llIIIIIll[48] = 135 ^ 166;
        llIIIIIll[49] = (114 ^ 75) ^ (93 ^ 70);
        llIIIIIll[50] = (143 ^ 194) ^ (234 ^ 132);
    }

    private static boolean lIlIIIllIIII(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0084, code lost:
        if (lIlIIIlIlIlI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    @Subscribe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(GameTick gameTick) {
        C0004e.w();
        int wildyLevel = Game.getWildyLevel();
        Player local = Players.getLocal();
        int combatLevel = local.getCombatLevel();
        if (lIlIIIlIlIII(Players.getNearest(player -> {
            if (lIlIIIllIIIl(player, local) && lIlIIIlIlIlI(a(wildyLevel, combatLevel, player) ? 1 : 0)) {
                ?? r0 = llIIIIIll[5];
                "".length();
                return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
            }
            return llIIIIIll[4];
        })) && (!lIlIIIlIllll(Game.getWildyLevel()) || lIlIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(al.mr), llIIIIIll[22]))) {
            int[] iArr = new int[llIIIIIll[5]];
            iArr[llIIIIIll[4]] = llIIIIIll[23];
            if (lIlIIIlIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIIll[5]];
                iArr2[llIIIIIll[4]] = llIIIIIll[24];
            }
            if (lIlIIIlIIlll(this.r.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (lIlIIIlIlIlI(Dialog.isOpen() ? 1 : 0) && lIlIIIlIlIII(Dialog.getText())) {
            if (lIlIIIlIlIlI(Dialog.getText().contains(llIIIIIlI[llIIIIIll[25]]) ? 1 : 0)) {
                C0024y.dt = llIIIIIll[5];
            }
            if (!lIlIIIlIIlll(Dialog.getText().contains(llIIIIIlI[llIIIIIll[26]]) ? 1 : 0) || lIlIIIlIlIlI(Dialog.getText().contains(llIIIIIlI[llIIIIIll[27]]) ? 1 : 0)) {
            }
            if (lIlIIIlIlIlI(Dialog.getText().contains(llIIIIIlI[llIIIIIll[28]]) ? 1 : 0)) {
            }
        }
        if (lIlIIIlIlIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
        C0004e.G();
    }

    protected int loop() {
        if (lIlIIIlIIllI(Game.getState(), GameState.LOGGED_IN)) {
            if (lIlIIIlIIlll(a.isEmpty() ? 1 : 0)) {
                if (!lIlIIIlIlIII(j) || lIlIIIlIlIIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (lIlIIIlIlIlI(a.get(llIIIIIll[4]).V() ? 1 : 0)) {
                    if (lIlIIIlIlIlI(a.get(llIIIIIll[4]).U().contains(llIIIIIlI[llIIIIIll[5]]) ? 1 : 0)) {
                        f += llIIIIIll[5];
                    }
                    System.out.println("Achieved " + a.get(llIIIIIll[4]).U() + " goal");
                    a.remove(llIIIIIll[4]);
                    "".length();
                    return llIIIIIll[6];
                } else if (lIlIIIlIIllI(Game.getState(), GameState.LOGGED_IN)) {
                    while (lIlIIIlIlIlI(C0004e.x() ? 1 : 0) && lIlIIIlIIlll(d ? 1 : 0) && lIlIIIlIlIll(C0004e.j(llIIIIIll[7]), llIIIIIll[8]) && lIlIIIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        c = llIIIIIlI[llIIIIIll[9]];
                        C0004e.y();
                        Time.sleepTicks(llIIIIIll[5]);
                        "".length();
                        "".length();
                        if ((-"  ".length()) >= 0) {
                            return ((42 ^ 53) ^ (17 ^ 7)) & (((((169 + 45) - 60) + 23) ^ (((4 + 162) - 103) + 121)) ^ (-" ".length()));
                        }
                    }
                    int lIllllllIllIll = llIIIIIll[4];
                    try {
                        lIllllllIllIll = a.get(llIIIIIll[4]).T();
                        "".length();
                        if ("   ".length() == 0) {
                            return (0 ^ 82) & ((97 ^ 51) ^ (-1));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return lIllllllIllIll;
                }
            }
            if (lIlIIIlIlIlI(a.isEmpty() ? 1 : 0)) {
                if (lIlIIIlIllII(Players.getLocal().getWorldLocation().distanceTo(an.mH), llIIIIIll[10])) {
                    c = llIIIIIlI[llIIIIIll[10]];
                    Movement.walkTo(an.mH);
                    "".length();
                }
                if (lIlIIIlIllIl(Players.getLocal().getWorldLocation().distanceTo(an.mH), llIIIIIll[10])) {
                    c = llIIIIIlI[llIIIIIll[11]];
                }
            }
            if (lIlIIIlIlllI(Vars.getBit(llIIIIIll[12]), llIIIIIll[13])) {
                String[] strArr = new String[llIIIIIll[5]];
                strArr[llIIIIIll[4]] = llIIIIIlI[llIIIIIll[14]];
                if (lIlIIIlIlIII(TileObjects.getNearest(strArr))) {
                    C0004e.E();
                }
            }
        }
        return llIIIIIll[15];
    }
}
