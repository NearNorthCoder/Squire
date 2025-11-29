/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonSyntaxException
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.WorldType
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.config.RuneScapeProfileType
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.WorldType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneScapeProfileType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.g;

@Singleton
public class f {
    private final /* synthetic */ Gson V;
    private final /* synthetic */ ConfigManager T;
    private static final /* synthetic */ Logger Q;
    private /* synthetic */ RuneScapeProfileType aa;
    private /* synthetic */ String Z;
    private /* synthetic */ List<Item> Y;
    private static final /* synthetic */ String R;
    private static /* synthetic */ String[] lIIIllIlIlIIl;
    private static /* synthetic */ int[] lIIIllIlIlIlI;
    private static final /* synthetic */ String S;
    public /* synthetic */ List<WorldType> X;
    private final /* synthetic */ g W;
    private final /* synthetic */ Client U;

    private static String lIlIIIlIlIlIlll(String lllllllllllllllIIIIlIIIllIlllIII, String lllllllllllllllIIIIlIIIllIllllII) {
        lllllllllllllllIIIIlIIIllIlllIII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIllIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIIllIlllIll = new StringBuilder();
        char[] lllllllllllllllIIIIlIIIllIlllIlI = lllllllllllllllIIIIlIIIllIllllII.toCharArray();
        int lllllllllllllllIIIIlIIIllIlllIIl = lIIIllIlIlIlI[1];
        char[] lllllllllllllllIIIIlIIIllIllIIll = lllllllllllllllIIIIlIIIllIlllIII.toCharArray();
        int lllllllllllllllIIIIlIIIllIllIIlI = lllllllllllllllIIIIlIIIllIllIIll.length;
        int lllllllllllllllIIIIlIIIllIllIIIl = lIIIllIlIlIlI[1];
        while (f.lIlIIIlIllIllIl(lllllllllllllllIIIIlIIIllIllIIIl, lllllllllllllllIIIIlIIIllIllIIlI)) {
            char lllllllllllllllIIIIlIIIllIlllllI = lllllllllllllllIIIIlIIIllIllIIll[lllllllllllllllIIIIlIIIllIllIIIl];
            lllllllllllllllIIIIlIIIllIlllIll.append((char)(lllllllllllllllIIIIlIIIllIlllllI ^ lllllllllllllllIIIIlIIIllIlllIlI[lllllllllllllllIIIIlIIIllIlllIIl % lllllllllllllllIIIIlIIIllIlllIlI.length]));
            0;
            ++lllllllllllllllIIIIlIIIllIlllIIl;
            ++lllllllllllllllIIIIlIIIllIllIIIl;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIIIllIlllIll);
    }

    private static boolean lIlIIIlIllIllII(int n2) {
        return n2 != 0;
    }

    private static String lIlIIIlIlIlIlIl(String lllllllllllllllIIIIlIIIllIlIIllI, String lllllllllllllllIIIIlIIIllIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIIIllIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIIIllIlIlIlI.init(lIIIllIlIlIlI[3], lllllllllllllllIIIIlIIIllIlIlIll);
            return new String(lllllllllllllllIIIIlIIIllIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIIllIlIlIIl) {
            lllllllllllllllIIIIlIIIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    public void o() {
        this.Z = null;
        this.aa = null;
        this.W.t();
        this.Y = new ArrayList<Item>();
    }

    public void r() {
        if (f.lIlIIIlIllIlIll(this.Z)) {
            return;
        }
        this.T.setConfiguration(lIIIllIlIlIIl[lIIIllIlIlIlI[4]], this.Z, lIIIllIlIlIIl[lIIIllIlIlIlI[0]], this.V.toJson((Object)this.W.v()));
    }

    public void p() {
        if (f.lIlIIIlIllIlIIl(RuneScapeProfileType.getCurrent((Client)this.U).equals((Object)this.aa) ? 1 : 0)) {
            f lllllllllllllllIIIIlIIIlllIllIlI;
            if (f.lIlIIIlIllIlIlI(this.Z)) {
                this.r();
            }
            lllllllllllllllIIIIlIIIlllIllIlI.q();
        }
    }

    private static String lIlIIIlIlIlIllI(String lllllllllllllllIIIIlIIIllIIllIIl, String lllllllllllllllIIIIlIIIllIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIllIIllIlI.getBytes(StandardCharsets.UTF_8)), lIIIllIlIlIlI[8]), "DES");
            Cipher lllllllllllllllIIIIlIIIllIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIIllIIlllIl.init(lIIIllIlIlIlI[3], lllllllllllllllIIIIlIIIllIIllllI);
            return new String(lllllllllllllllIIIIlIIIllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIIllIIlllII) {
            lllllllllllllllIIIIlIIIllIIlllII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private String s() {
        f lllllllllllllllIIIIlIIIlllIIllII;
        StringBuilder stringBuilder = new StringBuilder();
        EnumSet enumSet = this.U.getWorldType();
        Iterator lllllllllllllllIIIIlIIIlllIIlIIl = enumSet.iterator();
        while (f.lIlIIIlIllIllII(lllllllllllllllIIIIlIIIlllIIlIIl.hasNext() ? 1 : 0)) {
            WorldType lllllllllllllllIIIIlIIIlllIIlIII = (WorldType)lllllllllllllllIIIIlIIIlllIIlIIl.next();
            if (f.lIlIIIlIllIllII(lllllllllllllllIIIIlIIIlllIIllII.X.contains(lllllllllllllllIIIIlIIIlllIIlIII) ? 1 : 0)) {
                void lllllllllllllllIIIIlIIIlllIIlIll;
                lllllllllllllllIIIIlIIIlllIIlIll.append(lllllllllllllllIIIIlIIIlllIIlIII.name()).append(lIIIllIlIlIIl[lIIIllIlIlIlI[5]]);
                0;
            }
            0;
            if (null == null) continue;
            return null;
        }
        if (f.lIlIIIlIllIlIll(lllllllllllllllIIIIlIIIlllIIllII.U.getLocalPlayer())) {
            return lIIIllIlIlIIl[lIIIllIlIlIlI[6]];
        }
        stringBuilder.append(this.U.getLocalPlayer().getName());
        0;
        return String.valueOf(stringBuilder);
    }

    private void q() {
        f lllllllllllllllIIIIlIIIlllIlIllI;
        this.T.unsetConfiguration(lIIIllIlIlIIl[lIIIllIlIlIlI[1]], this.s());
        this.Z = this.T.getRSProfileKey();
        this.aa = RuneScapeProfileType.getCurrent((Client)this.U);
        String lllllllllllllllIIIIlIIIlllIlIlIl = this.T.getRSProfileConfiguration(lIIIllIlIlIIl[lIIIllIlIlIlI[2]], lIIIllIlIlIIl[lIIIllIlIlIlI[3]]);
        try {
            lllllllllllllllIIIIlIIIlllIlIllI.W.a((int[])lllllllllllllllIIIIlIIIlllIlIllI.V.fromJson(lllllllllllllllIIIIlIIIlllIlIlIl, int[].class));
            0;
        }
        catch (JsonSyntaxException lllllllllllllllIIIIlIIIlllIlIlII) {
            lllllllllllllllIIIIlIIIlllIlIllI.W.a(new int[lIIIllIlIlIlI[1]]);
            lllllllllllllllIIIIlIIIlllIlIllI.r();
        }
        if (2 < 0) {
            return;
        }
        this.Y = this.W.u();
    }

    private static boolean lIlIIIlIllIlIlI(Object object) {
        return object != null;
    }

    private static void lIlIIIlIlIllIII() {
        lIIIllIlIlIIl = new String[lIIIllIlIlIlI[9]];
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[1]] = f."squirequester";
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[2]] = f."squirequester";
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[3]] = f."bankitems";
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[4]] = f."squirequester";
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[0]] = f."bankitems";
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[5]] = f.":";
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[6]] = f."NULL PLAYER";
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[7]] = f."bankitems";
        f.lIIIllIlIlIIl[f.lIIIllIlIlIlI[8]] = f."squirequester";
    }

    public void a(Item[] itemArray) {
        this.W.b(itemArray);
        this.Y = this.W.u();
    }

    public List<Item> n() {
        return this.Y;
    }

    private static void lIlIIIlIllIlIII() {
        lIIIllIlIlIlI = new int[10];
        f.lIIIllIlIlIlI[0] = 124 + 165 - 274 + 179 ^ 33 + 125 - 36 + 76;
        f.lIIIllIlIlIlI[1] = (0xDD ^ 0x99) & ~(0x82 ^ 0xC6);
        f.lIIIllIlIlIlI[2] = 1;
        f.lIIIllIlIlIlI[3] = 2;
        f.lIIIllIlIlIlI[4] = 3;
        f.lIIIllIlIlIlI[5] = 1 ^ 4;
        f.lIIIllIlIlIlI[6] = 0xA4 ^ 0xA2;
        f.lIIIllIlIlIlI[7] = 0x8F ^ 0x88;
        f.lIIIllIlIlIlI[8] = 41 + 139 - 44 + 28 ^ 151 + 79 - 112 + 54;
        f.lIIIllIlIlIlI[9] = 161 + 4 - -10 + 31 ^ 69 + 33 - 52 + 149;
    }

    private static boolean lIlIIIlIllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIllIlIIl(int n2) {
        return n2 == 0;
    }

    static {
        f.lIlIIIlIllIlIII();
        f.lIlIIIlIlIllIII();
        S = lIIIllIlIlIIl[lIIIllIlIlIlI[7]];
        R = lIIIllIlIlIIl[lIIIllIlIlIlI[8]];
        Q = LoggerFactory.getLogger(f.class);
    }

    private static boolean lIlIIIlIllIlIll(Object object) {
        return object == null;
    }

    @Inject
    public f(Client client, ConfigManager configManager, Gson gson) {
        WorldType[] worldTypeArray = new WorldType[lIIIllIlIlIlI[0]];
        worldTypeArray[f.lIIIllIlIlIlI[1]] = WorldType.SEASONAL;
        worldTypeArray[f.lIIIllIlIlIlI[2]] = WorldType.TOURNAMENT_WORLD;
        worldTypeArray[f.lIIIllIlIlIlI[3]] = WorldType.DEADMAN;
        worldTypeArray[f.lIIIllIlIlIlI[4]] = WorldType.NOSAVE_MODE;
        this.X = Arrays.asList(worldTypeArray);
        this.T = configManager;
        this.U = client;
        this.V = gson;
        this.W = new g();
        this.Y = new ArrayList<Item>();
    }
}

