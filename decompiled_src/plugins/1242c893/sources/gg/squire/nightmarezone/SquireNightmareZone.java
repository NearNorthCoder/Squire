package gg.squire.nightmarezone;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.nightmarezone.overlay.NMZInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.a;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.d;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.e;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.f;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.g;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.h;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.i;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.j;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.k;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.l;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.m;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.n;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.o;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.p;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.q;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.r;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.s;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.t;
@PluginDescriptor(name = "Squire Nightmare Zone", enabledByDefault = false)
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:gg/squire/nightmarezone/SquireNightmareZone.class */
public class SquireNightmareZone extends SquirePlugin {
    @Inject
    private /* synthetic */ NMZInfoBox d;
    @Inject
    private /* synthetic */ EventBus h;
    @Inject
    private /* synthetic */ OverlayManager b;
    private static /* synthetic */ int[] lIIIlIIllIlll;
    @Inject
    private /* synthetic */ SquireNightmareZoneConfig c;
    private static /* synthetic */ String[] lIIIlIIllIlIl;
    @Inject
    private /* synthetic */ a i;
    private /* synthetic */ InventorySetup e;
    private final /* synthetic */ HashSet<Prayer> a = new HashSet<>();
    private /* synthetic */ boolean f = lIIIlIIllIlll[0];
    private /* synthetic */ int[] g = new int[lIIIlIIllIlll[0]];

    private static boolean lIIlllllIllIIlI(int i, int i2) {
        return i < i2;
    }

    public SquireNightmareZoneConfig e() {
        return this.c;
    }

    public int[] c() {
        int[] ids = EquipmentSetup.get().getIds();
        int i = lIIIlIIllIlll[0];
        int i2 = lIIIlIIllIlll[0];
        while (lIIlllllIllIIlI(i2, ids.length)) {
            if (lIIlllllIllIIll(ids[i2])) {
                int i3 = i;
                i++;
                ids[i3] = ids[i2];
            }
            i2++;
            "".length();
            if ((-" ".length()) > (-" ".length())) {
                return null;
            }
        }
        return Arrays.copyOf(ids, i);
    }

    private static String lIIlllllIlIIlIl(String lllllllllllllllIIIIllllIIIllIlIl, String lllllllllllllllIIIIllllIIIllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIIllIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIllllIIIllIllI) {
            lllllllllllllllIIIIllllIIIllIllI.printStackTrace();
            return null;
        }
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIIlIIllIlll[1]];
        clsArr[lIIIlIIllIlll[0]] = j.class;
        clsArr[lIIIlIIllIlll[2]] = k.class;
        clsArr[lIIIlIIllIlll[3]] = m.class;
        clsArr[lIIIlIIllIlll[4]] = i.class;
        clsArr[lIIIlIIllIlll[5]] = e.class;
        clsArr[lIIIlIIllIlll[6]] = f.class;
        clsArr[lIIIlIIllIlll[7]] = h.class;
        clsArr[lIIIlIIllIlll[8]] = d.class;
        clsArr[lIIIlIIllIlll[9]] = g.class;
        clsArr[lIIIlIIllIlll[10]] = s.class;
        clsArr[lIIIlIIllIlll[11]] = n.class;
        clsArr[lIIIlIIllIlll[12]] = r.class;
        clsArr[lIIIlIIllIlll[13]] = q.class;
        clsArr[lIIIlIIllIlll[14]] = o.class;
        clsArr[lIIIlIIllIlll[15]] = p.class;
        clsArr[lIIIlIIllIlll[16]] = t.class;
        clsArr[lIIIlIIllIlll[17]] = l.class;
        return clsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStart() {
        this.f = lIIIlIIllIlll[0];
        this.b.add(this.d);
        "".length();
        a(new InventorySetup());
        this.h.register(this.i);
        this.g = c();
        System.out.println("AfkGear: " + Arrays.toString(this.g));
    }

    @Provides
    SquireNightmareZoneConfig a(ConfigManager configManager) {
        return (SquireNightmareZoneConfig) configManager.getConfig(SquireNightmareZoneConfig.class);
    }

    public int b() {
        List<Item> all = Inventory.getAll(item -> {
            return item.getName().contains(lIIIlIIllIlIl[lIIIlIIllIlll[8]]);
        });
        int i = lIIIlIIllIlll[0];
        for (Item item2 : all) {
            String lllllllllllllllIIIIllllIIllIIlII = item2.getName();
            i += Integer.parseInt(lllllllllllllllIIIIllllIIllIIlII.replaceAll(lIIIlIIllIlIl[lIIIlIIllIlll[3]], lIIIlIIllIlIl[lIIIlIIllIlll[4]]));
            "".length();
            if ((78 ^ 75) <= 0) {
                return (33 ^ 22) & ((47 ^ 24) ^ (-1));
            }
        }
        return i;
    }

    public boolean g() {
        return this.f;
    }

    private static void lIIlllllIllIIII() {
        lIIIlIIllIlll = new int[18];
        lIIIlIIllIlll[0] = (145 ^ 194) & ((42 ^ 121) ^ (-1));
        lIIIlIIllIlll[1] = 110 ^ 127;
        lIIIlIIllIlll[2] = " ".length();
        lIIIlIIllIlll[3] = "  ".length();
        lIIIlIIllIlll[4] = "   ".length();
        lIIIlIIllIlll[5] = (((37 + 47) - 24) + 104) ^ (((79 + 69) - 4) + 16);
        lIIIlIIllIlll[6] = 12 ^ 9;
        lIIIlIIllIlll[7] = 157 ^ 155;
        lIIIlIIllIlll[8] = (36 ^ 96) ^ (17 ^ 82);
        lIIIlIIllIlll[9] = 173 ^ 165;
        lIIIlIIllIlll[10] = 152 ^ 145;
        lIIIlIIllIlll[11] = 32 ^ 42;
        lIIIlIIllIlll[12] = (((22 + 157) - 61) + 64) ^ (((156 + 71) - 185) + 147);
        lIIIlIIllIlll[13] = 113 ^ 125;
        lIIIlIIllIlll[14] = 45 ^ 32;
        lIIIlIIllIlll[15] = 27 ^ 21;
        lIIIlIIllIlll[16] = 84 ^ 91;
        lIIIlIIllIlll[17] = (111 ^ 33) ^ (220 ^ 130);
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a.clear();
    }

    private static boolean lIIlllllIllIlIl(int i) {
        return i == 0;
    }

    protected void onStop() {
        this.b.remove(this.d);
        "".length();
        this.h.unregister(this.i);
    }

    static {
        lIIlllllIllIIII();
        lIIlllllIlIllll();
    }

    public int a() {
        List<Item> all = Inventory.getAll(item -> {
            return item.getName().contains(lIIIlIIllIlIl[lIIIlIIllIlll[9]]);
        });
        int lllllllllllllllIIIIllllIIlllIIll = lIIIlIIllIlll[0];
        for (Item item2 : all) {
            int lllllllllllllllIIIIllllIIllIllll = Integer.parseInt(item2.getName().replaceAll(lIIIlIIllIlIl[lIIIlIIllIlll[0]], lIIIlIIllIlIl[lIIIlIIllIlll[2]]));
            lllllllllllllllIIIIllllIIlllIIll += lllllllllllllllIIIIllllIIllIllll;
            "".length();
            if ("   ".length() == 0) {
                return (66 ^ 28) & ((15 ^ 81) ^ (-1));
            }
        }
        return lllllllllllllllIIIIllllIIlllIIll;
    }

    private static String lIIlllllIlIlllI(String lllllllllllllllIIIIllllIIlIIlIlI, String lllllllllllllllIIIIllllIIlIIlIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIllllIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIIllllIIlIIIlll = lllllllllllllllIIIIllllIIlIIlIIl.toCharArray();
        int lllllllllllllllIIIIllllIIlIIIllI = lIIIlIIllIlll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIlIIllIlll[0];
        while (lIIlllllIllIIlI(i, length)) {
            char lllllllllllllllIIIIllllIIlIIlIll = charArray[i];
            sb.append((char) (lllllllllllllllIIIIllllIIlIIlIll ^ lllllllllllllllIIIIllllIIlIIIlll[lllllllllllllllIIIIllllIIlIIIllI % lllllllllllllllIIIIllllIIlIIIlll.length]));
            "".length();
            lllllllllllllllIIIIllllIIlIIIllI++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public void a(boolean z) {
        this.f = z;
    }

    public void a(InventorySetup inventorySetup) {
        this.e = inventorySetup;
    }

    private static boolean lIIlllllIllIIll(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        ChatMessageType type = chatMessage.getType();
        String lllllllllllllllIIIIllllIIlIlIlIl = chatMessage.getMessage();
        if (lIIlllllIllIlII(type, ChatMessageType.GAMEMESSAGE) && lIIlllllIllIlII(type, ChatMessageType.SPAM) && lIIlllllIllIlII(type, ChatMessageType.WELCOME)) {
            return;
        }
        if (lIIlllllIllIIIl(lllllllllllllllIIIIllllIIlIlIlIl.contains(lIIIlIIllIlIl[lIIIlIIllIlll[5]]) ? 1 : 0)) {
            this.f = lIIIlIIllIlll[2];
            this.g = c();
        }
        if (!lIIlllllIllIlIl(lllllllllllllllIIIIllllIIlIlIlIl.contains(lIIIlIIllIlIl[lIIIlIIllIlll[6]]) ? 1 : 0) || lIIlllllIllIIIl(lllllllllllllllIIIIllllIIlIlIlIl.contains(lIIIlIIllIlIl[lIIIlIIllIlll[7]]) ? 1 : 0)) {
            this.f = lIIIlIIllIlll[0];
        }
    }

    private static boolean lIIlllllIllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    public HashSet<Prayer> d() {
        return this.a;
    }

    private static String lIIlllllIlIIlII(String lllllllllllllllIIIIllllIIIlIlIII, String lllllllllllllllIIIIllllIIIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIllllIIIlIIlll.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIlll[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIIllIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIllllIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIllllIIIlIlIIl) {
            lllllllllllllllIIIIllllIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    public InventorySetup f() {
        return this.e;
    }

    public int[] h() {
        return this.g;
    }

    private static void lIIlllllIlIllll() {
        lIIIlIIllIlIl = new String[lIIIlIIllIlll[10]];
        lIIIlIIllIlIl[lIIIlIIllIlll[0]] = lIIlllllIlIIlII("2k9JmKUJXRU=", "tbpOH");
        lIIIlIIllIlIl[lIIIlIIllIlll[2]] = lIIlllllIlIIlIl("HdTEYsr3y5w=", "glmYK");
        lIIIlIIllIlIl[lIIIlIIllIlll[3]] = lIIlllllIlIIlIl("GAAjA+3LRqA=", "FYLju");
        lIIIlIIllIlIl[lIIIlIIllIlll[4]] = lIIlllllIlIIlIl("f2jtYtKuMv8=", "HUQUw");
        lIIIlIIllIlIl[lIIIlIIllIlll[5]] = lIIlllllIlIIlII("KwlNfhNP6NTNAAbdbnF9BmzntSAddosx8NR1PksjAos=", "Ouhvz");
        lIIIlIIllIlIl[lIIIlIIllIlll[6]] = lIIlllllIlIIlIl("s+yTO62o3W21y/Ouq20TvTmO58HZ8LMg", "KfiPy");
        lIIIlIIllIlIl[lIIIlIIllIlll[7]] = lIIlllllIlIIlIl("1hal2qc6CakGrMJrciRQpDYae66B+Viyg+bbm9gJTyA=", "XKhKR");
        lIIIlIIllIlIl[lIIIlIIllIlll[8]] = lIIlllllIlIlllI("JS85ChoUOSMKBkRl", "dMJeh");
        lIIIlIIllIlIl[lIIIlIIllIlll[9]] = lIIlllllIlIIlII("npNI0fWjfC0kOmMDNTFqyA==", "prowX");
    }

    private static boolean lIIlllllIllIIIl(int i) {
        return i != 0;
    }
}
