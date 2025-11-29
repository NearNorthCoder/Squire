package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.au  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/au.class */
public final class EnumC0021au {
    public static final /* synthetic */ EnumC0021au CELASTRUS;
    public static final /* synthetic */ EnumC0021au COMPOST;
    public static final /* synthetic */ EnumC0021au MAHOGANY;
    public static final /* synthetic */ EnumC0021au CADANTINE;
    public static final /* synthetic */ EnumC0021au CACTUS;
    public static final /* synthetic */ EnumC0021au PINEAPPLE;
    private final /* synthetic */ String contractName;
    public static final /* synthetic */ EnumC0021au AVANTOE;
    public static final /* synthetic */ EnumC0021au SPIRIT_TREE;
    public static final /* synthetic */ EnumC0021au YANILLIAN;
    public static final /* synthetic */ EnumC0021au ORANGE;
    private final /* synthetic */ int tickrate;
    public static final /* synthetic */ EnumC0021au CADAVABERRIES;
    public static final /* synthetic */ EnumC0021au WEEDS;
    public static final /* synthetic */ EnumC0021au REDBERRIES;
    public static final /* synthetic */ EnumC0021au CALQUAT;
    public static final /* synthetic */ EnumC0021au BELLADONNA;
    public static final /* synthetic */ EnumC0021au HESPORI;
    public static final /* synthetic */ EnumC0021au PAPAYA;
    public static final /* synthetic */ EnumC0021au OAK;
    public static final /* synthetic */ EnumC0021au KRONOS;
    public static final /* synthetic */ EnumC0021au ULTRACOMPOST;
    public static final /* synthetic */ EnumC0021au MAGIC;
    public static final /* synthetic */ EnumC0021au WHITEBERRIES;
    private final /* synthetic */ int regrowTickrate;
    public static final /* synthetic */ EnumC0021au WOAD;
    public static final /* synthetic */ EnumC0021au WHITE_LILY;
    private static final /* synthetic */ EnumC0021au[] $VALUES;
    public static final /* synthetic */ EnumC0021au MUSHROOM;
    public static final /* synthetic */ EnumC0021au BANANA;
    public static final /* synthetic */ EnumC0021au CRYSTAL_TREE;
    public static final /* synthetic */ EnumC0021au WILDBLOOD;
    public static final /* synthetic */ EnumC0021au SNAPE_GRASS;
    public static final /* synthetic */ EnumC0021au DRAGONFRUIT;
    public static final /* synthetic */ EnumC0021au STRAWBERRY;
    public static final /* synthetic */ EnumC0021au POTATO;
    public static final /* synthetic */ EnumC0021au TORSTOL;
    public static final /* synthetic */ EnumC0021au SWEETCORN;
    public static final /* synthetic */ EnumC0021au TARROMIN;
    public static final /* synthetic */ EnumC0021au CABBAGE;
    public static final /* synthetic */ EnumC0021au SNAPDRAGON;
    public static final /* synthetic */ EnumC0021au WILLOW;
    public static final /* synthetic */ EnumC0021au GIANT_ROTTEN_TOMATO;
    public static final /* synthetic */ EnumC0021au ANYHERB;
    public static final /* synthetic */ EnumC0021au EMPTY_GIANT_COMPOST_BIN;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ EnumC0021au POTATO_CACTUS;
    public static final /* synthetic */ EnumC0021au CURRY;
    public static final /* synthetic */ EnumC0021au LANTADYME;
    public static final /* synthetic */ EnumC0021au JANGERBERRIES;
    public static final /* synthetic */ EnumC0021au ONION;
    private final /* synthetic */ String name;
    private static /* synthetic */ String[] lIlllIIlllII;
    public static final /* synthetic */ EnumC0021au GIANT_SUPERCOMPOST;
    public static final /* synthetic */ EnumC0021au GRAPE;
    public static final /* synthetic */ EnumC0021au PALM;
    public static final /* synthetic */ EnumC0021au YEW;
    public static final /* synthetic */ EnumC0021au LIMPWURT;
    public static final /* synthetic */ EnumC0021au DWELLBERRIES;
    public static final /* synthetic */ EnumC0021au APPLE;
    public static final /* synthetic */ EnumC0021au IASOR;
    public static final /* synthetic */ EnumC0021au TOMATO;
    public static final /* synthetic */ EnumC0021au ROSEMARY;
    public static final /* synthetic */ EnumC0021au SCARECROW;
    public static final /* synthetic */ EnumC0021au GIANT_COMPOST;
    public static final /* synthetic */ EnumC0021au GIANT_ULTRACOMPOST;
    public static final /* synthetic */ EnumC0021au KWUARM;
    public static final /* synthetic */ EnumC0021au GOUTWEED;
    public static final /* synthetic */ EnumC0021au ATTAS;
    public static final /* synthetic */ EnumC0021au WATERMELON;
    public static final /* synthetic */ EnumC0021au NASTURTIUM;
    public static final /* synthetic */ EnumC0021au POISON_IVY;
    public static final /* synthetic */ EnumC0021au MAPLE;
    public static final /* synthetic */ EnumC0021au RANARR;
    public static final /* synthetic */ EnumC0021au MARRENTILL;
    public static final /* synthetic */ EnumC0021au ASGARNIAN;
    public static final /* synthetic */ EnumC0021au REDWOOD;
    public static final /* synthetic */ EnumC0021au TEAK;
    public static final /* synthetic */ EnumC0021au KRANDORIAN;
    private final /* synthetic */ P patchImplementation;
    private static /* synthetic */ int[] lIlllIlllllI;
    public static final /* synthetic */ EnumC0021au IRIT;
    private final /* synthetic */ int stages;
    private final /* synthetic */ int harvestStages;
    public static final /* synthetic */ EnumC0021au SEAWEED;
    public static final /* synthetic */ EnumC0021au BARLEY;
    public static final /* synthetic */ EnumC0021au ROTTEN_TOMATO;
    public static final /* synthetic */ EnumC0021au HARRALANDER;
    public static final /* synthetic */ EnumC0021au MARIGOLD;
    public static final /* synthetic */ EnumC0021au JUTE;
    public static final /* synthetic */ EnumC0021au GUAM;
    public static final /* synthetic */ EnumC0021au HAMMERSTONE;
    public static final /* synthetic */ EnumC0021au SUPERCOMPOST;
    public static final /* synthetic */ EnumC0021au TOADFLAX;
    public static final /* synthetic */ EnumC0021au DWARF_WEED;
    public static final /* synthetic */ EnumC0021au EMPTY_COMPOST_BIN;

    public int bk() {
        return this.harvestStages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    public boolean bg() {
        if (lllIlllIIIlIll(this, COMPOST) && lllIlllIIIlIll(this, GIANT_COMPOST) && lllIlllIIIlIll(this, SUPERCOMPOST) && lllIlllIIIlIll(this, GIANT_SUPERCOMPOST) && lllIlllIIIlIll(this, ULTRACOMPOST) && lllIlllIIIlIll(this, GIANT_ULTRACOMPOST) && lllIlllIIIlIll(this, ROTTEN_TOMATO) && !lllIlllIIIllII(this, GIANT_ROTTEN_TOMATO)) {
            return lIlllIlllllI[0];
        }
        ?? r0 = lIlllIlllllI[1];
        "".length();
        return ((138 ^ 179) & ((17 ^ 40) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    public static EnumC0021au[] values() {
        return (EnumC0021au[]) $VALUES.clone();
    }

    public int bj() {
        return this.regrowTickrate;
    }

    private static boolean lllIlllIIIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lllIlIllllllIl(String lllllllllllllllIlIllIIlIllIllIIl, String lllllllllllllllIlIllIIlIllIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIllIllIII.getBytes(StandardCharsets.UTF_8)), lIlllIlllllI[12]), "DES");
            Cipher lllllllllllllllIlIllIIlIllIllIll = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIlIllIllIll.init(lIlllIlllllI[5], secretKeySpec);
            return new String(lllllllllllllllIlIllIIlIllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIlIllIllIlI) {
            lllllllllllllllIlIllIIlIllIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlllllllI(String lllllllllllllllIlIllIIlIlllIlllI, String lllllllllllllllIlIllIIlIlllIllIl) {
        String lllllllllllllllIlIllIIlIlllIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIlllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIllIIlIlllIlIll = lllllllllllllllIlIllIIlIlllIllIl.toCharArray();
        int lllllllllllllllIlIllIIlIlllIlIlI = lIlllIlllllI[0];
        char[] charArray = lllllllllllllllIlIllIIlIlllIlllI2.toCharArray();
        int length = charArray.length;
        int i = lIlllIlllllI[0];
        while (lllIlllIIIlIII(i, length)) {
            char lllllllllllllllIlIllIIlIlllIllll = charArray[i];
            sb.append((char) (lllllllllllllllIlIllIIlIlllIllll ^ lllllllllllllllIlIllIIlIlllIlIll[lllllllllllllllIlIllIIlIlllIlIlI % lllllllllllllllIlIllIIlIlllIlIll.length]));
            "".length();
            lllllllllllllllIlIllIIlIlllIlIlI++;
            i++;
            "".length();
            if ((194 ^ 199) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIlllIIIlIIl(int i, int i2) {
        return i == i2;
    }

    public String ac() {
        return this.name;
    }

    private static String lllIlIlllllIIl(String lllllllllllllllIlIllIIlIlllllllI, String lllllllllllllllIlIllIIlIllllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIlllllI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIlIllllllll) {
            lllllllllllllllIlIllIIlIllllllll.printStackTrace();
            return null;
        }
    }

    static {
        lllIlllIIIIlll();
        lllIllIlIlIlll();
        WEEDS = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[0]], lIlllIlllllI[0], lIlllIIlllII[lIlllIlllllI[1]], lIlllIlllllI[2], lIlllIlllllI[3], lIlllIlllllI[4]);
        SCARECROW = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[5]], lIlllIlllllI[1], lIlllIIlllII[lIlllIlllllI[6]], lIlllIlllllI[7], lIlllIlllllI[3], lIlllIlllllI[4]);
        POTATO = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[4]], lIlllIlllllI[5], lIlllIIlllII[lIlllIlllllI[3]], lIlllIIlllII[lIlllIlllllI[8]], P.ALLOTMENT, lIlllIlllllI[9], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        ONION = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[11]], lIlllIlllllI[6], lIlllIIlllII[lIlllIlllllI[12]], lIlllIIlllII[lIlllIlllllI[13]], P.ALLOTMENT, lIlllIlllllI[14], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        CABBAGE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[10]], lIlllIlllllI[4], lIlllIIlllII[lIlllIlllllI[15]], lIlllIIlllII[lIlllIlllllI[16]], P.ALLOTMENT, lIlllIlllllI[17], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        TOMATO = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[18]], lIlllIlllllI[3], lIlllIIlllII[lIlllIlllllI[19]], lIlllIIlllII[lIlllIlllllI[20]], P.ALLOTMENT, lIlllIlllllI[21], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        SWEETCORN = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[22]], lIlllIlllllI[8], lIlllIIlllII[lIlllIlllllI[23]], P.ALLOTMENT, lIlllIlllllI[24], lIlllIlllllI[10], lIlllIlllllI[11], lIlllIlllllI[0], lIlllIlllllI[6]);
        STRAWBERRY = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[25]], lIlllIlllllI[11], lIlllIIlllII[lIlllIlllllI[26]], lIlllIIlllII[lIlllIlllllI[27]], P.ALLOTMENT, lIlllIlllllI[28], lIlllIlllllI[10], lIlllIlllllI[11], lIlllIlllllI[0], lIlllIlllllI[6]);
        WATERMELON = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[29]], lIlllIlllllI[12], lIlllIIlllII[lIlllIlllllI[30]], lIlllIIlllII[lIlllIlllllI[31]], P.ALLOTMENT, lIlllIlllllI[32], lIlllIlllllI[10], lIlllIlllllI[13], lIlllIlllllI[0], lIlllIlllllI[6]);
        SNAPE_GRASS = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[33]], lIlllIlllllI[13], lIlllIIlllII[lIlllIlllllI[34]], P.ALLOTMENT, lIlllIlllllI[35], lIlllIlllllI[10], lIlllIlllllI[12], lIlllIlllllI[0], lIlllIlllllI[6]);
        MARIGOLD = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[36]], lIlllIlllllI[10], lIlllIIlllII[lIlllIlllllI[37]], lIlllIIlllII[lIlllIlllllI[38]], P.FLOWER, lIlllIlllllI[39], lIlllIlllllI[3], lIlllIlllllI[3]);
        ROSEMARY = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[40]], lIlllIlllllI[15], lIlllIIlllII[lIlllIlllllI[41]], P.FLOWER, lIlllIlllllI[42], lIlllIlllllI[3], lIlllIlllllI[3]);
        NASTURTIUM = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[43]], lIlllIlllllI[16], lIlllIIlllII[lIlllIlllllI[44]], lIlllIIlllII[lIlllIlllllI[45]], P.FLOWER, lIlllIlllllI[46], lIlllIlllllI[3], lIlllIlllllI[3]);
        WOAD = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[47]], lIlllIlllllI[18], lIlllIIlllII[lIlllIlllllI[48]], P.FLOWER, lIlllIlllllI[49], lIlllIlllllI[3], lIlllIlllllI[3]);
        LIMPWURT = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[50]], lIlllIlllllI[19], lIlllIIlllII[lIlllIlllllI[51]], lIlllIIlllII[lIlllIlllllI[52]], P.FLOWER, lIlllIlllllI[53], lIlllIlllllI[3], lIlllIlllllI[3]);
        WHITE_LILY = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[54]], lIlllIlllllI[20], lIlllIIlllII[lIlllIlllllI[55]], lIlllIIlllII[lIlllIlllllI[56]], P.FLOWER, lIlllIlllllI[57], lIlllIlllllI[3], lIlllIlllllI[3]);
        REDBERRIES = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[58]], lIlllIlllllI[22], lIlllIIlllII[lIlllIlllllI[59]], lIlllIIlllII[lIlllIlllllI[60]], P.BUSH, lIlllIlllllI[61], lIlllIlllllI[27], lIlllIlllllI[8], lIlllIlllllI[27], lIlllIlllllI[3]);
        CADAVABERRIES = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[62]], lIlllIlllllI[23], lIlllIIlllII[lIlllIlllllI[63]], lIlllIIlllII[lIlllIlllllI[64]], P.BUSH, lIlllIlllllI[65], lIlllIlllllI[27], lIlllIlllllI[11], lIlllIlllllI[27], lIlllIlllllI[3]);
        DWELLBERRIES = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[66]], lIlllIlllllI[25], lIlllIIlllII[lIlllIlllllI[67]], lIlllIIlllII[lIlllIlllllI[68]], P.BUSH, lIlllIlllllI[69], lIlllIlllllI[27], lIlllIlllllI[12], lIlllIlllllI[27], lIlllIlllllI[3]);
        JANGERBERRIES = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[70]], lIlllIlllllI[26], lIlllIIlllII[lIlllIlllllI[71]], lIlllIIlllII[lIlllIlllllI[72]], P.BUSH, lIlllIlllllI[73], lIlllIlllllI[27], lIlllIlllllI[13], lIlllIlllllI[27], lIlllIlllllI[3]);
        WHITEBERRIES = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[74]], lIlllIlllllI[27], lIlllIIlllII[lIlllIlllllI[75]], lIlllIIlllII[lIlllIlllllI[76]], P.BUSH, lIlllIlllllI[77], lIlllIlllllI[27], lIlllIlllllI[13], lIlllIlllllI[27], lIlllIlllllI[3]);
        POISON_IVY = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[78]], lIlllIlllllI[29], lIlllIIlllII[lIlllIlllllI[79]], lIlllIIlllII[lIlllIlllllI[80]], P.BUSH, lIlllIlllllI[81], lIlllIlllllI[27], lIlllIlllllI[13], lIlllIlllllI[27], lIlllIlllllI[3]);
        BARLEY = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[82]], lIlllIlllllI[30], lIlllIIlllII[lIlllIlllllI[83]], P.HOPS, lIlllIlllllI[84], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        HAMMERSTONE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[85]], lIlllIlllllI[31], lIlllIIlllII[lIlllIlllllI[86]], P.HOPS, lIlllIlllllI[87], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        ASGARNIAN = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[88]], lIlllIlllllI[33], lIlllIIlllII[lIlllIlllllI[89]], P.HOPS, lIlllIlllllI[90], lIlllIlllllI[10], lIlllIlllllI[8], lIlllIlllllI[0], lIlllIlllllI[6]);
        JUTE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[91]], lIlllIlllllI[34], lIlllIIlllII[lIlllIlllllI[92]], P.HOPS, lIlllIlllllI[93], lIlllIlllllI[10], lIlllIlllllI[8], lIlllIlllllI[0], lIlllIlllllI[6]);
        YANILLIAN = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[94]], lIlllIlllllI[36], lIlllIIlllII[lIlllIlllllI[95]], P.HOPS, lIlllIlllllI[96], lIlllIlllllI[10], lIlllIlllllI[11], lIlllIlllllI[0], lIlllIlllllI[6]);
        KRANDORIAN = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[97]], lIlllIlllllI[37], lIlllIIlllII[lIlllIlllllI[98]], P.HOPS, lIlllIlllllI[99], lIlllIlllllI[10], lIlllIlllllI[12], lIlllIlllllI[0], lIlllIlllllI[6]);
        WILDBLOOD = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[100]], lIlllIlllllI[38], lIlllIIlllII[lIlllIlllllI[101]], P.HOPS, lIlllIlllllI[102], lIlllIlllllI[10], lIlllIlllllI[13], lIlllIlllllI[0], lIlllIlllllI[6]);
        GUAM = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[103]], lIlllIlllllI[40], lIlllIIlllII[lIlllIlllllI[104]], P.HERB, lIlllIlllllI[105], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        MARRENTILL = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[106]], lIlllIlllllI[41], lIlllIIlllII[lIlllIlllllI[107]], P.HERB, lIlllIlllllI[108], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        TARROMIN = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[109]], lIlllIlllllI[43], lIlllIIlllII[lIlllIlllllI[110]], P.HERB, lIlllIlllllI[111], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        HARRALANDER = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[112]], lIlllIlllllI[44], lIlllIIlllII[lIlllIlllllI[113]], P.HERB, lIlllIlllllI[114], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        RANARR = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[115]], lIlllIlllllI[45], lIlllIIlllII[lIlllIlllllI[116]], P.HERB, lIlllIlllllI[117], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        TOADFLAX = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[118]], lIlllIlllllI[47], lIlllIIlllII[lIlllIlllllI[119]], P.HERB, lIlllIlllllI[120], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        IRIT = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[121]], lIlllIlllllI[48], lIlllIIlllII[lIlllIlllllI[122]], P.HERB, lIlllIlllllI[123], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        AVANTOE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[124]], lIlllIlllllI[50], lIlllIIlllII[lIlllIlllllI[125]], P.HERB, lIlllIlllllI[126], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        KWUARM = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[127]], lIlllIlllllI[51], lIlllIIlllII[lIlllIlllllI[128]], P.HERB, lIlllIlllllI[129], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        SNAPDRAGON = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[130]], lIlllIlllllI[52], lIlllIIlllII[lIlllIlllllI[131]], P.HERB, lIlllIlllllI[132], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        CADANTINE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[133]], lIlllIlllllI[54], lIlllIIlllII[lIlllIlllllI[134]], P.HERB, lIlllIlllllI[135], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        LANTADYME = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[136]], lIlllIlllllI[55], lIlllIIlllII[lIlllIlllllI[137]], P.HERB, lIlllIlllllI[138], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        DWARF_WEED = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[139]], lIlllIlllllI[56], lIlllIIlllII[lIlllIlllllI[140]], P.HERB, lIlllIlllllI[141], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        TORSTOL = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[142]], lIlllIlllllI[58], lIlllIIlllII[lIlllIlllllI[143]], P.HERB, lIlllIlllllI[144], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        GOUTWEED = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[145]], lIlllIlllllI[59], lIlllIIlllII[lIlllIlllllI[146]], P.HERB, lIlllIlllllI[147], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[5]);
        ANYHERB = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[148]], lIlllIlllllI[60], lIlllIIlllII[lIlllIlllllI[149]], P.HERB, lIlllIlllllI[105], lIlllIlllllI[27], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[6]);
        OAK = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[150]], lIlllIlllllI[62], lIlllIIlllII[lIlllIlllllI[151]], lIlllIIlllII[lIlllIlllllI[152]], P.TREE, lIlllIlllllI[153], lIlllIlllllI[55], lIlllIlllllI[3]);
        WILLOW = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[154]], lIlllIlllllI[63], lIlllIIlllII[lIlllIlllllI[155]], lIlllIIlllII[lIlllIlllllI[156]], P.TREE, lIlllIlllllI[157], lIlllIlllllI[55], lIlllIlllllI[11]);
        MAPLE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[158]], lIlllIlllllI[64], lIlllIIlllII[lIlllIlllllI[159]], lIlllIIlllII[lIlllIlllllI[160]], P.TREE, lIlllIlllllI[161], lIlllIlllllI[55], lIlllIlllllI[13]);
        YEW = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[162]], lIlllIlllllI[66], lIlllIIlllII[lIlllIlllllI[163]], lIlllIIlllII[lIlllIlllllI[164]], P.TREE, lIlllIlllllI[165], lIlllIlllllI[55], lIlllIlllllI[15]);
        MAGIC = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[166]], lIlllIlllllI[67], lIlllIIlllII[lIlllIlllllI[167]], lIlllIIlllII[lIlllIlllllI[168]], P.TREE, lIlllIlllllI[169], lIlllIlllllI[55], lIlllIlllllI[18]);
        APPLE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[170]], lIlllIlllllI[68], lIlllIIlllII[lIlllIlllllI[171]], lIlllIIlllII[lIlllIlllllI[172]], P.FRUIT_TREE, lIlllIlllllI[173], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        BANANA = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[175]], lIlllIlllllI[70], lIlllIIlllII[lIlllIlllllI[176]], lIlllIIlllII[lIlllIlllllI[177]], P.FRUIT_TREE, lIlllIlllllI[178], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        ORANGE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[179]], lIlllIlllllI[71], lIlllIIlllII[lIlllIlllllI[180]], lIlllIIlllII[lIlllIlllllI[181]], P.FRUIT_TREE, lIlllIlllllI[182], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        CURRY = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[183]], lIlllIlllllI[72], lIlllIIlllII[lIlllIlllllI[184]], lIlllIIlllII[lIlllIlllllI[185]], P.FRUIT_TREE, lIlllIlllllI[186], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        PINEAPPLE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[187]], lIlllIlllllI[74], lIlllIIlllII[lIlllIlllllI[188]], lIlllIIlllII[lIlllIlllllI[189]], P.FRUIT_TREE, lIlllIlllllI[190], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        PAPAYA = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[191]], lIlllIlllllI[75], lIlllIIlllII[lIlllIlllllI[192]], lIlllIIlllII[lIlllIlllllI[193]], P.FRUIT_TREE, lIlllIlllllI[194], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        PALM = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[195]], lIlllIlllllI[76], lIlllIIlllII[lIlllIlllllI[196]], lIlllIIlllII[lIlllIlllllI[197]], P.FRUIT_TREE, lIlllIlllllI[198], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        DRAGONFRUIT = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[199]], lIlllIlllllI[78], lIlllIIlllII[lIlllIlllllI[200]], lIlllIIlllII[lIlllIlllllI[201]], P.FRUIT_TREE, lIlllIlllllI[202], lIlllIlllllI[174], lIlllIlllllI[11], lIlllIlllllI[62], lIlllIlllllI[11]);
        CACTUS = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[203]], lIlllIlllllI[79], lIlllIIlllII[lIlllIlllllI[204]], P.CACTUS, lIlllIlllllI[205], lIlllIlllllI[112], lIlllIlllllI[12], lIlllIlllllI[27], lIlllIlllllI[4]);
        POTATO_CACTUS = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[206]], lIlllIlllllI[80], lIlllIIlllII[lIlllIlllllI[207]], lIlllIIlllII[lIlllIlllllI[208]], P.CACTUS, lIlllIlllllI[209], lIlllIlllllI[10], lIlllIlllllI[12], lIlllIlllllI[3], lIlllIlllllI[11]);
        TEAK = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[210]], lIlllIlllllI[82], lIlllIIlllII[lIlllIlllllI[211]], P.HARDWOOD_TREE, lIlllIlllllI[212], lIlllIlllllI[213], lIlllIlllllI[12]);
        MAHOGANY = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[214]], lIlllIlllllI[83], lIlllIIlllII[lIlllIlllllI[215]], P.HARDWOOD_TREE, lIlllIlllllI[216], lIlllIlllllI[213], lIlllIlllllI[13]);
        ATTAS = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[217]], lIlllIlllllI[85], lIlllIIlllII[lIlllIlllllI[218]], P.ANIMA, lIlllIlllllI[219], lIlllIlllllI[213], lIlllIlllllI[13]);
        IASOR = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[220]], lIlllIlllllI[86], lIlllIIlllII[lIlllIlllllI[221]], P.ANIMA, lIlllIlllllI[222], lIlllIlllllI[213], lIlllIlllllI[13]);
        KRONOS = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[223]], lIlllIlllllI[88], lIlllIIlllII[lIlllIlllllI[224]], P.ANIMA, lIlllIlllllI[225], lIlllIlllllI[213], lIlllIlllllI[13]);
        SEAWEED = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[174]], lIlllIlllllI[89], lIlllIIlllII[lIlllIlllllI[226]], P.SEAWEED, lIlllIlllllI[227], lIlllIlllllI[10], lIlllIlllllI[3], lIlllIlllllI[0], lIlllIlllllI[4]);
        GRAPE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[228]], lIlllIlllllI[91], lIlllIIlllII[lIlllIlllllI[229]], P.GRAPES, lIlllIlllllI[230], lIlllIlllllI[3], lIlllIlllllI[12], lIlllIlllllI[0], lIlllIlllllI[3]);
        MUSHROOM = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[231]], lIlllIlllllI[92], lIlllIIlllII[lIlllIlllllI[232]], P.MUSHROOM, lIlllIlllllI[233], lIlllIlllllI[55], lIlllIlllllI[11], lIlllIlllllI[0], lIlllIlllllI[11]);
        BELLADONNA = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[234]], lIlllIlllllI[94], lIlllIIlllII[lIlllIlllllI[235]], P.BELLADONNA, lIlllIlllllI[236], lIlllIlllllI[112], lIlllIlllllI[3]);
        CALQUAT = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[237]], lIlllIlllllI[95], lIlllIIlllII[lIlllIlllllI[238]], P.CALQUAT, lIlllIlllllI[239], lIlllIlllllI[174], lIlllIlllllI[13], lIlllIlllllI[0], lIlllIlllllI[11]);
        SPIRIT_TREE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[240]], lIlllIlllllI[97], lIlllIIlllII[lIlllIlllllI[241]], P.SPIRIT_TREE, lIlllIlllllI[242], lIlllIlllllI[243], lIlllIlllllI[18]);
        CELASTRUS = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[244]], lIlllIlllllI[98], lIlllIIlllII[lIlllIlllllI[245]], lIlllIIlllII[lIlllIlllllI[246]], P.CELASTRUS, lIlllIlllllI[247], lIlllIlllllI[174], lIlllIlllllI[8], lIlllIlllllI[0], lIlllIlllllI[4]);
        REDWOOD = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[248]], lIlllIlllllI[100], lIlllIIlllII[lIlllIlllllI[249]], lIlllIIlllII[lIlllIlllllI[250]], P.REDWOOD, lIlllIlllllI[251], lIlllIlllllI[213], lIlllIlllllI[15]);
        HESPORI = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[252]], lIlllIlllllI[101], lIlllIIlllII[lIlllIlllllI[253]], P.HESPORI, lIlllIlllllI[254], lIlllIlllllI[213], lIlllIlllllI[4], lIlllIlllllI[0], lIlllIlllllI[5]);
        CRYSTAL_TREE = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[255]], lIlllIlllllI[103], lIlllIIlllII[lIlllIlllllI[256]], P.CRYSTAL_TREE, lIlllIlllllI[257], lIlllIlllllI[112], lIlllIlllllI[11]);
        EMPTY_COMPOST_BIN = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[258]], lIlllIlllllI[104], lIlllIIlllII[lIlllIlllllI[259]], P.COMPOST, lIlllIlllllI[260], lIlllIlllllI[0], lIlllIlllllI[1], lIlllIlllllI[0], lIlllIlllllI[0]);
        COMPOST = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[261]], lIlllIlllllI[106], lIlllIIlllII[lIlllIlllllI[262]], P.COMPOST, lIlllIlllllI[263], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[20]);
        SUPERCOMPOST = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[264]], lIlllIlllllI[107], lIlllIIlllII[lIlllIlllllI[265]], P.COMPOST, lIlllIlllllI[266], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[20]);
        ULTRACOMPOST = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[267]], lIlllIlllllI[109], lIlllIIlllII[lIlllIlllllI[268]], P.COMPOST, lIlllIlllllI[269], lIlllIlllllI[0], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[20]);
        ROTTEN_TOMATO = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[270]], lIlllIlllllI[110], lIlllIIlllII[lIlllIlllllI[271]], P.COMPOST, lIlllIlllllI[272], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[20]);
        EMPTY_GIANT_COMPOST_BIN = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[273]], lIlllIlllllI[112], lIlllIIlllII[lIlllIlllllI[274]], P.COMPOST, lIlllIlllllI[260], lIlllIlllllI[0], lIlllIlllllI[1], lIlllIlllllI[0], lIlllIlllllI[0]);
        GIANT_COMPOST = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[275]], lIlllIlllllI[113], lIlllIIlllII[lIlllIlllllI[276]], P.GIANT_COMPOST, lIlllIlllllI[263], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[41]);
        GIANT_SUPERCOMPOST = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[277]], lIlllIlllllI[115], lIlllIIlllII[lIlllIlllllI[278]], P.GIANT_COMPOST, lIlllIlllllI[266], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[41]);
        GIANT_ULTRACOMPOST = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[279]], lIlllIlllllI[116], lIlllIIlllII[lIlllIlllllI[280]], P.GIANT_COMPOST, lIlllIlllllI[269], lIlllIlllllI[0], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[41]);
        GIANT_ROTTEN_TOMATO = new EnumC0021au(lIlllIIlllII[lIlllIlllllI[281]], lIlllIlllllI[118], lIlllIIlllII[lIlllIlllllI[282]], P.GIANT_COMPOST, lIlllIlllllI[272], lIlllIlllllI[55], lIlllIlllllI[6], lIlllIlllllI[0], lIlllIlllllI[41]);
        EnumC0021au[] enumC0021auArr = new EnumC0021au[lIlllIlllllI[119]];
        enumC0021auArr[lIlllIlllllI[0]] = WEEDS;
        enumC0021auArr[lIlllIlllllI[1]] = SCARECROW;
        enumC0021auArr[lIlllIlllllI[5]] = POTATO;
        enumC0021auArr[lIlllIlllllI[6]] = ONION;
        enumC0021auArr[lIlllIlllllI[4]] = CABBAGE;
        enumC0021auArr[lIlllIlllllI[3]] = TOMATO;
        enumC0021auArr[lIlllIlllllI[8]] = SWEETCORN;
        enumC0021auArr[lIlllIlllllI[11]] = STRAWBERRY;
        enumC0021auArr[lIlllIlllllI[12]] = WATERMELON;
        enumC0021auArr[lIlllIlllllI[13]] = SNAPE_GRASS;
        enumC0021auArr[lIlllIlllllI[10]] = MARIGOLD;
        enumC0021auArr[lIlllIlllllI[15]] = ROSEMARY;
        enumC0021auArr[lIlllIlllllI[16]] = NASTURTIUM;
        enumC0021auArr[lIlllIlllllI[18]] = WOAD;
        enumC0021auArr[lIlllIlllllI[19]] = LIMPWURT;
        enumC0021auArr[lIlllIlllllI[20]] = WHITE_LILY;
        enumC0021auArr[lIlllIlllllI[22]] = REDBERRIES;
        enumC0021auArr[lIlllIlllllI[23]] = CADAVABERRIES;
        enumC0021auArr[lIlllIlllllI[25]] = DWELLBERRIES;
        enumC0021auArr[lIlllIlllllI[26]] = JANGERBERRIES;
        enumC0021auArr[lIlllIlllllI[27]] = WHITEBERRIES;
        enumC0021auArr[lIlllIlllllI[29]] = POISON_IVY;
        enumC0021auArr[lIlllIlllllI[30]] = BARLEY;
        enumC0021auArr[lIlllIlllllI[31]] = HAMMERSTONE;
        enumC0021auArr[lIlllIlllllI[33]] = ASGARNIAN;
        enumC0021auArr[lIlllIlllllI[34]] = JUTE;
        enumC0021auArr[lIlllIlllllI[36]] = YANILLIAN;
        enumC0021auArr[lIlllIlllllI[37]] = KRANDORIAN;
        enumC0021auArr[lIlllIlllllI[38]] = WILDBLOOD;
        enumC0021auArr[lIlllIlllllI[40]] = GUAM;
        enumC0021auArr[lIlllIlllllI[41]] = MARRENTILL;
        enumC0021auArr[lIlllIlllllI[43]] = TARROMIN;
        enumC0021auArr[lIlllIlllllI[44]] = HARRALANDER;
        enumC0021auArr[lIlllIlllllI[45]] = RANARR;
        enumC0021auArr[lIlllIlllllI[47]] = TOADFLAX;
        enumC0021auArr[lIlllIlllllI[48]] = IRIT;
        enumC0021auArr[lIlllIlllllI[50]] = AVANTOE;
        enumC0021auArr[lIlllIlllllI[51]] = KWUARM;
        enumC0021auArr[lIlllIlllllI[52]] = SNAPDRAGON;
        enumC0021auArr[lIlllIlllllI[54]] = CADANTINE;
        enumC0021auArr[lIlllIlllllI[55]] = LANTADYME;
        enumC0021auArr[lIlllIlllllI[56]] = DWARF_WEED;
        enumC0021auArr[lIlllIlllllI[58]] = TORSTOL;
        enumC0021auArr[lIlllIlllllI[59]] = GOUTWEED;
        enumC0021auArr[lIlllIlllllI[60]] = ANYHERB;
        enumC0021auArr[lIlllIlllllI[62]] = OAK;
        enumC0021auArr[lIlllIlllllI[63]] = WILLOW;
        enumC0021auArr[lIlllIlllllI[64]] = MAPLE;
        enumC0021auArr[lIlllIlllllI[66]] = YEW;
        enumC0021auArr[lIlllIlllllI[67]] = MAGIC;
        enumC0021auArr[lIlllIlllllI[68]] = APPLE;
        enumC0021auArr[lIlllIlllllI[70]] = BANANA;
        enumC0021auArr[lIlllIlllllI[71]] = ORANGE;
        enumC0021auArr[lIlllIlllllI[72]] = CURRY;
        enumC0021auArr[lIlllIlllllI[74]] = PINEAPPLE;
        enumC0021auArr[lIlllIlllllI[75]] = PAPAYA;
        enumC0021auArr[lIlllIlllllI[76]] = PALM;
        enumC0021auArr[lIlllIlllllI[78]] = DRAGONFRUIT;
        enumC0021auArr[lIlllIlllllI[79]] = CACTUS;
        enumC0021auArr[lIlllIlllllI[80]] = POTATO_CACTUS;
        enumC0021auArr[lIlllIlllllI[82]] = TEAK;
        enumC0021auArr[lIlllIlllllI[83]] = MAHOGANY;
        enumC0021auArr[lIlllIlllllI[85]] = ATTAS;
        enumC0021auArr[lIlllIlllllI[86]] = IASOR;
        enumC0021auArr[lIlllIlllllI[88]] = KRONOS;
        enumC0021auArr[lIlllIlllllI[89]] = SEAWEED;
        enumC0021auArr[lIlllIlllllI[91]] = GRAPE;
        enumC0021auArr[lIlllIlllllI[92]] = MUSHROOM;
        enumC0021auArr[lIlllIlllllI[94]] = BELLADONNA;
        enumC0021auArr[lIlllIlllllI[95]] = CALQUAT;
        enumC0021auArr[lIlllIlllllI[97]] = SPIRIT_TREE;
        enumC0021auArr[lIlllIlllllI[98]] = CELASTRUS;
        enumC0021auArr[lIlllIlllllI[100]] = REDWOOD;
        enumC0021auArr[lIlllIlllllI[101]] = HESPORI;
        enumC0021auArr[lIlllIlllllI[103]] = CRYSTAL_TREE;
        enumC0021auArr[lIlllIlllllI[104]] = EMPTY_COMPOST_BIN;
        enumC0021auArr[lIlllIlllllI[106]] = COMPOST;
        enumC0021auArr[lIlllIlllllI[107]] = SUPERCOMPOST;
        enumC0021auArr[lIlllIlllllI[109]] = ULTRACOMPOST;
        enumC0021auArr[lIlllIlllllI[110]] = ROTTEN_TOMATO;
        enumC0021auArr[lIlllIlllllI[112]] = EMPTY_GIANT_COMPOST_BIN;
        enumC0021auArr[lIlllIlllllI[113]] = GIANT_COMPOST;
        enumC0021auArr[lIlllIlllllI[115]] = GIANT_SUPERCOMPOST;
        enumC0021auArr[lIlllIlllllI[116]] = GIANT_ULTRACOMPOST;
        enumC0021auArr[lIlllIlllllI[118]] = GIANT_ROTTEN_TOMATO;
        $VALUES = enumC0021auArr;
    }

    private EnumC0021au(String str, int i, String str2, String str3, P p, int i2, int i3, int i4) {
        this(str, i, str2, str3, p, i2, i3, i4, lIlllIlllllI[0], lIlllIlllllI[1]);
    }

    @Nullable
    public static EnumC0021au d(String str) {
        EnumC0021au[] values = values();
        int length = values.length;
        int lllllllllllllllIlIllIIllIIIIlIIl = lIlllIlllllI[0];
        while (lllIlllIIIlIII(lllllllllllllllIlIllIIllIIIIlIIl, length)) {
            EnumC0021au enumC0021au = values[lllllllllllllllIlIllIIllIIIIlIIl];
            if (lllIlllIIIlIlI(enumC0021au.k().equalsIgnoreCase(str) ? 1 : 0)) {
                return enumC0021au;
            }
            lllllllllllllllIlIllIIllIIIIlIIl++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return null;
    }

    private static void lllIllIlIlIlll() {
        lIlllIIlllII = new String[lIlllIlllllI[283]];
        lIlllIIlllII[lIlllIlllllI[0]] = lllIlIlllllIIl("RoSqD7mE65g=", "DtfrK");
        lIlllIIlllII[lIlllIlllllI[1]] = lllIlIlllllIIl("7KWdcM+xSY4=", "hyVCw");
        lIlllIIlllII[lIlllIlllllI[5]] = lllIlIlllllIIl("KQ4cCruHm7hRWKkYoAOOSQ==", "NHNdm");
        lIlllIIlllII[lIlllIlllllI[6]] = lllIlIlllllIIl("UeIXVtTqdbY63XUsWktVYw==", "nKLZz");
        lIlllIIlllII[lIlllIlllllI[4]] = lllIlIllllllIl("33Gl8RB6du0=", "EOVzC");
        lIlllIIlllII[lIlllIlllllI[3]] = lllIlIlllllllI("MQosMxcO", "aeXRc");
        lIlllIIlllII[lIlllIlllllI[8]] = lllIlIllllllIl("F817MJJ7xnPXbWs0dbY96A==", "KRkNN");
        lIlllIIlllII[lIlllIlllllI[11]] = lllIlIlllllllI("GDkGCCI=", "WwOGl");
        lIlllIIlllII[lIlllIlllllI[12]] = lllIlIlllllIIl("b3502g3q2VM=", "xKTuW");
        lIlllIIlllII[lIlllIlllllI[13]] = lllIlIllllllIl("2zEms9UTFME=", "EsAhl");
        lIlllIIlllII[lIlllIlllllI[10]] = lllIlIlllllllI("CQYsMxkNAg==", "JGnqX");
        lIlllIIlllII[lIlllIlllllI[15]] = lllIlIlllllIIl("+IbePttmf9U=", "faMxb");
        lIlllIIlllII[lIlllIlllllI[16]] = lllIlIlllllIIl("pmzftHa5JKhFBBXNYuSSUQ==", "YDxlN");
        lIlllIIlllII[lIlllIlllllI[18]] = lllIlIlllllIIl("trBn3nb4cJc=", "WuDGR");
        lIlllIIlllII[lIlllIlllllI[19]] = lllIlIllllllIl("pG3koYm8FUk=", "pbkHB");
        lIlllIIlllII[lIlllIlllllI[20]] = lllIlIlllllIIl("4TMH4jrIFSZYac/njduGpw==", "RrDhb");
        lIlllIIlllII[lIlllIlllllI[22]] = lllIlIllllllIl("44XZhuPXYXAJPAC6ePf8cg==", "UsCOa");
        lIlllIIlllII[lIlllIlllllI[23]] = lllIlIlllllllI("IQUhDTsRHTYG", "rrDhO");
        lIlllIIlllII[lIlllIlllllI[25]] = lllIlIllllllIl("be865JhjxxKEyLDcYuobJg==", "bOfCo");
        lIlllIIlllII[lIlllIlllllI[26]] = lllIlIlllllIIl("PS9j6JlZITaPss0ObJRTRw==", "SSTHB");
        lIlllIIlllII[lIlllIlllllI[27]] = lllIlIlllllllI("ACECDxAxMAIcDjYm", "SUpng");
        lIlllIIlllII[lIlllIlllllI[29]] = lllIlIlllllIIl("bQo5egKi5g+nSXPRVBrJVg==", "gZbBV");
        lIlllIIlllII[lIlllIlllllI[30]] = lllIlIlllllllI("LSI3HTQXJi8XKA==", "zCCxF");
        lIlllIIlllII[lIlllIlllllI[31]] = lllIlIllllllIl("f2NZzSEnLIXn/ybW6z4o2A==", "Xkudc");
        lIlllIIlllII[lIlllIlllllI[33]] = lllIlIllllllIl("SvJNTau+GIjk3VIi+hq7hQ==", "kbYIk");
        lIlllIIlllII[lIlllIlllllI[34]] = lllIlIlllllllI("IDkXIi9TMAQzOQA=", "sWvRJ");
        lIlllIIlllII[lIlllIlllllI[36]] = lllIlIlllllllI("ODgVIhU6NQM=", "uyGkR");
        lIlllIIlllII[lIlllIlllllI[37]] = lllIlIlllllIIl("uVntK4WnabGaIUpyBkILfQ==", "LmbMF");
        lIlllIIlllII[lIlllIlllllI[38]] = lllIlIlllllIIl("NzNxCIzL5Zc4da3+Mzyj+Q==", "bVbGD");
        lIlllIIlllII[lIlllIlllllI[40]] = lllIlIllllllIl("L1fHh14U2aNnfCvMcm419Q==", "IZuAQ");
        lIlllIIlllII[lIlllIlllllI[41]] = lllIlIlllllllI("JgwrHQQVESE=", "tcXxi");
        lIlllIIlllII[lIlllIlllllI[43]] = lllIlIllllllIl("FSiPgGRakzSDjV9eLQuL1Q==", "AEnEn");
        lIlllIIlllII[lIlllIlllllI[44]] = lllIlIlllllIIl("YEce8GXKwl/Ci4VN0HfJQA==", "GvjoL");
        lIlllIIlllII[lIlllIlllllI[45]] = lllIlIllllllIl("TGe5H2MIZDvLj8bK1Oeysw==", "Rewzo");
        lIlllIIlllII[lIlllIlllllI[47]] = lllIlIlllllllI("ASwNHA==", "VcLXg");
        lIlllIIlllII[lIlllIlllllI[48]] = lllIlIlllllllI("NAQmEw==", "ckGwD");
        lIlllIIlllII[lIlllIlllllI[50]] = lllIlIlllllllI("Dw4rCBMWFTI=", "CGfXD");
        lIlllIIlllII[lIlllIlllllI[51]] = lllIlIlllllllI("AyQlAyU6Pzw=", "OMHsR");
        lIlllIIlllII[lIlllIlllllI[52]] = lllIlIlllllllI("JDECJjQdKht2MQc3GyU=", "hXoVC");
        lIlllIIlllII[lIlllIlllllI[54]] = lllIlIlllllIIl("4+AWAn/Z9tCeBNCEznWT6w==", "Nfnjd");
        lIlllIIlllII[lIlllIlllllI[55]] = lllIlIlllllIIl("efh1jCFXFuqLY/Sg9ypcog==", "XGaor");
        lIlllIIlllII[lIlllIlllllI[56]] = lllIlIlllllIIl("unfaH3q1eE/nxckwsRmUeA==", "HSWhe");
        lIlllIIlllII[lIlllIlllllI[58]] = lllIlIlllllllI("MTA9BQgxJzACHg==", "cuyGM");
        lIlllIIlllII[lIlllIlllllI[59]] = lllIlIlllllllI("IAsRETAAHAw=", "rnusU");
        lIlllIIlllII[lIlllIlllllI[60]] = lllIlIllllllIl("WnHpfyvQlhS1GXb/rQKNfA==", "fYdaE");
        lIlllIIlllII[lIlllIlllllI[62]] = lllIlIllllllIl("0LrK3V6U+/QjmfcSe3If/g==", "szKUO");
        lIlllIIlllII[lIlllIlllllI[63]] = lllIlIlllllllI("OzY3MhIZNTYhFgE=", "xWSSd");
        lIlllIIlllII[lIlllIlllllI[64]] = lllIlIllllllIl("4eVFA+TymmegggEbXFhPag==", "wVZSu");
        lIlllIIlllII[lIlllIlllllI[66]] = lllIlIlllllllI("AjMnOQkEITAnDAM3", "FdbuE");
        lIlllIIlllII[lIlllIlllllI[67]] = lllIlIllllllIl("7DU+UNB4KOIbxpnwx442eg==", "FbOYv");
        lIlllIIlllII[lIlllIlllllI[68]] = lllIlIlllllIIl("FljVcSlnJKVOwhAttrAwjw==", "MllSd");
        lIlllIIlllII[lIlllIlllllI[70]] = lllIlIllllllIl("rPHAyCJ/y3CsPciyJehcUw==", "IRQqj");
        lIlllIIlllII[lIlllIlllllI[71]] = lllIlIlllllllI("LhAXBBcWExwRAB0=", "dqycr");
        lIlllIIlllII[lIlllIlllllI[72]] = lllIlIlllllllI("ISADFAEZIwgBFgIkHg==", "kAmsd");
        lIlllIIlllII[lIlllIlllllI[74]] = lllIlIlllllllI("PT4LHzwoMxAZMC8l", "jvBKy");
        lIlllIIlllII[lIlllIlllllI[75]] = lllIlIlllllllI("JDolIikRNz4kNQ==", "sRLVL");
        lIlllIIlllII[lIlllIlllllI[76]] = lllIlIllllllIl("XxOX34N4DqHWOKESEvAb8w==", "CiqYq");
        lIlllIIlllII[lIlllIlllllI[78]] = lllIlIlllllllI("EiclGQ4MNyUcGA==", "BhlJA");
        lIlllIIlllII[lIlllIlllllI[79]] = lllIlIllllllIl("Kagj0Dp/TOV7nJBRIJZ8tg==", "DDajV");
        lIlllIIlllII[lIlllIlllllI[80]] = lllIlIllllllIl("Bq8Af6k4FSDn6hxQqCAGcGZsDfeCH3fU", "dWalU");
        lIlllIIlllII[lIlllIlllllI[82]] = lllIlIlllllllI("KSMqGwQy", "kbxWA");
        lIlllIIlllII[lIlllIlllllI[83]] = lllIlIllllllIl("wDuKhwDZDeQ=", "qKoTI");
        lIlllIIlllII[lIlllIlllllI[85]] = lllIlIlllllllI("AjMhJQQYITgnDw8=", "JrlhA");
        lIlllIIlllII[lIlllIlllllI[86]] = lllIlIlllllllI("DwQfAyY1FgYBLSI=", "GernC");
        lIlllIIlllII[lIlllIlllllI[88]] = lllIlIlllllIIl("5s/bdbskUy5yumXqJl37Ew==", "lxBEP");
        lIlllIIlllII[lIlllIlllllI[89]] = lllIlIlllllllI("DhwVBTohBhMK", "OordH");
        lIlllIIlllII[lIlllIlllllI[91]] = lllIlIllllllIl("jSvvzwpcTEg=", "RPKXt");
        lIlllIIlllII[lIlllIlllllI[92]] = lllIlIlllllllI("MwMXLw==", "yvcJK");
        lIlllIIlllII[lIlllIlllllI[94]] = lllIlIllllllIl("z6H2L8ZWds56ZvBqkJ2ulg==", "EMfEU");
        lIlllIIlllII[lIlllIlllllI[95]] = lllIlIlllllIIl("+DablorxvblSIngPnzzO2w==", "YvjqG");
        lIlllIIlllII[lIlllIlllllI[97]] = lllIlIlllllIIl("4Na5Ee2pAi64hP/BPWEEtg==", "yyoSa");
        lIlllIIlllII[lIlllIlllllI[98]] = lllIlIlllllIIl("DlQQVwhZnEjaj4cbNLRP6g==", "gopHO");
        lIlllIIlllII[lIlllIlllllI[100]] = lllIlIlllllllI("MhsZKQspHRop", "eRUmI");
        lIlllIIlllII[lIlllIlllllI[101]] = lllIlIlllllIIl("+2JzH6QJ8ppZhZ4OjV6CDg==", "FfTuB");
        lIlllIIlllII[lIlllIlllllI[103]] = lllIlIlllllIIl("HoMWuin1Z6o=", "wZXUw");
        lIlllIIlllII[lIlllIlllllI[104]] = lllIlIllllllIl("i1u14TPNko0=", "cgaXK");
        lIlllIIlllII[lIlllIlllllI[106]] = lllIlIlllllllI("JjkGGColLB0GIw==", "kxTJo");
        lIlllIIlllII[lIlllIlllllI[107]] = lllIlIlllllllI("CAo2CzMrHy0VOg==", "EkDyV");
        lIlllIIlllII[lIlllIlllllI[109]] = lllIlIllllllIl("2iPO2G4cugv2R+ae14yCEA==", "aEpou");
        lIlllIIlllII[lIlllIlllllI[110]] = lllIlIllllllIl("kvYEUGPj8s4BZjff8MyERg==", "rkxml");
        lIlllIIlllII[lIlllIlllllI[112]] = lllIlIlllllllI("ICkrJCokKTcyLjo=", "hhyvk");
        lIlllIIlllII[lIlllIlllllI[113]] = lllIlIllllllIl("jTjsF+QTxP4QB00AX/Pgdg==", "SHywg");
        lIlllIIlllII[lIlllIlllllI[115]] = lllIlIllllllIl("EFkzrewSVXg=", "Ewmfk");
        lIlllIIlllII[lIlllIlllllI[116]] = lllIlIlllllllI("NCYfLxAU", "fGqNb");
        lIlllIIlllII[lIlllIlllllI[118]] = lllIlIlllllllI("HRcCMjUFGRs=", "IXCvs");
        lIlllIIlllII[lIlllIlllllI[119]] = lllIlIlllllllI("OBkCFDYAFxs=", "lvcpP");
        lIlllIIlllII[lIlllIlllllI[121]] = lllIlIllllllIl("ys/OXXHdhpc=", "CEXzZ");
        lIlllIIlllII[lIlllIlllllI[122]] = lllIlIlllllllI("MD4HIg==", "yLnVr");
        lIlllIIlllII[lIlllIlllllI[124]] = lllIlIlllllIIl("1xXvgZ2Gn9w=", "CRmpX");
        lIlllIIlllII[lIlllIlllllI[125]] = lllIlIlllllIIl("A7kBY0rnl8E=", "SBFRp");
        lIlllIIlllII[lIlllIlllllI[127]] = lllIlIlllllIIl("TNajTSuijrk=", "vbNVD");
        lIlllIIlllII[lIlllIlllllI[128]] = lllIlIlllllllI("GwQbESM9", "PsnpQ");
        lIlllIIlllII[lIlllIlllllI[130]] = lllIlIllllllIl("9R3+4ybzEzsPFa5VIJf0iw==", "XAqBo");
        lIlllIIlllII[lIlllIlllllI[131]] = lllIlIlllllllI("FSUTHS40KhUCJA==", "FKrmJ");
        lIlllIIlllII[lIlllIlllllI[133]] = lllIlIlllllIIl("2yIjR4Y0hTct2LIjNUrWXQ==", "ZnBcu");
        lIlllIIlllII[lIlllIlllllI[134]] = lllIlIlllllllI("IhIeFCoVGhQQ", "aszuD");
        lIlllIIlllII[lIlllIlllllI[136]] = lllIlIllllllIl("3kn5mf3bdod1ZZTjir44DA==", "cHakY");
        lIlllIIlllII[lIlllIlllllI[137]] = lllIlIlllllIIl("Q30+kZgwmEgwPDPAd9eZsw==", "GdWey");
        lIlllIIlllII[lIlllIlllllI[139]] = lllIlIlllllIIl("LtFTsxCk/Tksld4tBgS7ng==", "fiiGd");
        lIlllIIlllII[lIlllIlllllI[140]] = lllIlIlllllIIl("3JCm8/WCnnv700SR16r9sA==", "cHcXS");
        lIlllIIlllII[lIlllIlllllI[142]] = lllIlIlllllllI("NSQXOh0uJw==", "akEiI");
        lIlllIIlllII[lIlllIlllllI[143]] = lllIlIllllllIl("wrXisGPTHsA=", "gCBUN");
        lIlllIIlllII[lIlllIlllllI[145]] = lllIlIlllllIIl("W/9/wk3QRGbE/NLeHXo9dg==", "RSxwm");
        lIlllIIlllII[lIlllIlllllI[146]] = lllIlIlllllllI("IQMHMTQDCRY=", "flrEC");
        lIlllIIlllII[lIlllIlllllI[148]] = lllIlIlllllIIl("mzxjNCK+lVs=", "qjDzw");
        lIlllIIlllII[lIlllIlllllI[149]] = lllIlIlllllllI("EjwUZgA2IA8=", "SRmFh");
        lIlllIIlllII[lIlllIlllllI[150]] = lllIlIllllllIl("Jo+ylUEnjK4=", "ZuKGW");
        lIlllIIlllII[lIlllIlllllI[151]] = lllIlIllllllIl("+D9rM/jGSZ0=", "tMxEM");
        lIlllIIlllII[lIlllIlllllI[152]] = lllIlIlllllIIl("/ub4U22ng+iCIXRDcznNag==", "IsnIC");
        lIlllIIlllII[lIlllIlllllI[154]] = lllIlIllllllIl("zDR/57sX+ww=", "dAFzC");
        lIlllIIlllII[lIlllIlllllI[155]] = lllIlIllllllIl("cIqbgyBK3Es=", "ehEqP");
        lIlllIIlllII[lIlllIlllllI[156]] = lllIlIlllllllI("MzkBCT0TcBkXNwE=", "dPmeR");
        lIlllIIlllII[lIlllIlllllI[158]] = lllIlIllllllIl("VDA5u70rO8o=", "EWgby");
        lIlllIIlllII[lIlllIlllllI[159]] = lllIlIlllllIIl("SEx6JlJqomo=", "IEEpA");
        lIlllIIlllII[lIlllIlllllI[160]] = lllIlIlllllllI("DC4CKDJhOwAhMg==", "AOrDW");
        lIlllIIlllII[lIlllIlllllI[162]] = lllIlIlllllIIl("20QZuGQdDBY=", "aINcu");
        lIlllIIlllII[lIlllIlllllI[163]] = lllIlIllllllIl("lSvMEZIxB8Y=", "LdjSs");
        lIlllIIlllII[lIlllIlllllI[164]] = lllIlIlllllllI("FgMcRDk9Aw4=", "OfkdM");
        lIlllIIlllII[lIlllIlllllI[166]] = lllIlIlllllIIl("U6MpdtXSyqQ=", "kkNYn");
        lIlllIIlllII[lIlllIlllllI[167]] = lllIlIlllllIIl("68RU5BU0qW8=", "meiLo");
        lIlllIIlllII[lIlllIlllllI[168]] = lllIlIlllllIIl("cwiB+WD0L3RwUzEp2XRnrA==", "HXTmw");
        lIlllIIlllII[lIlllIlllllI[170]] = lllIlIllllllIl("a9C/noT8BfA=", "BIIzY");
        lIlllIIlllII[lIlllIlllllI[171]] = lllIlIlllllllI("GzUGPxA=", "ZEvSu");
        lIlllIIlllII[lIlllIlllllI[172]] = lllIlIllllllIl("wCvrAq3+GK4o8r6ckcfbFw==", "DBQzg");
        lIlllIIlllII[lIlllIlllllI[175]] = lllIlIlllllllI("Ay8FEBgA", "AnKQV");
        lIlllIIlllII[lIlllIlllllI[176]] = lllIlIlllllIIl("taigujaSod4=", "mkXOd");
        lIlllIIlllII[lIlllIlllllI[177]] = lllIlIlllllllI("OwAIJTkYQRI2Mhw=", "yafDW");
        lIlllIIlllII[lIlllIlllllI[179]] = lllIlIlllllllI("GjsJKBUQ", "UiHfR");
        lIlllIIlllII[lIlllIlllllI[180]] = lllIlIlllllllI("NwcqLSQd", "xuKCC");
        lIlllIIlllII[lIlllIlllllI[181]] = lllIlIlllllIIl("4ZtN4PVZ8zcg9DAA2Hsj2A==", "wJulR");
        lIlllIIlllII[lIlllIlllllI[183]] = lllIlIllllllIl("WyTA8L+2/bo=", "qhuOF");
        lIlllIIlllII[lIlllIlllllI[184]] = lllIlIlllllIIl("STDN3zblgXM=", "IyAvq");
        lIlllIIlllII[lIlllIlllllI[185]] = lllIlIllllllIl("clVVP+oCRZL47lbFz3oN3A==", "CIbnG");
        lIlllIIlllII[lIlllIlllllI[187]] = lllIlIlllllllI("PScBPQM9PgM9", "mnOxB");
        lIlllIIlllII[lIlllIlllllI[188]] = lllIlIlllllllI("NwYUACkXHxYA", "gozeH");
        lIlllIIlllII[lIlllIlllllI[189]] = lllIlIlllllllI("IwUCMBEDHAAwUAMADTsE", "sllUp");
        lIlllIIlllII[lIlllIlllllI[191]] = lllIlIlllllllI("BRE8AwgU", "UPlBQ");
        lIlllIIlllII[lIlllIlllllI[192]] = lllIlIllllllIl("ff0G5UkgCtY=", "BZQcR");
        lIlllIIlllII[lIlllIlllllI[193]] = lllIlIlllllllI("Mg4kIzsDTyAwJwc=", "boTBB");
        lIlllIIlllII[lIlllIlllllI[195]] = lllIlIllllllIl("naFuqEJ8DNE=", "BXpCA");
        lIlllIIlllII[lIlllIlllllI[196]] = lllIlIllllllIl("F85Wkao1pWE=", "WGEmG");
        lIlllIIlllII[lIlllIlllllI[197]] = lllIlIllllllIl("aiK1Cdqx0s7IGma2BZHB4w==", "VgeaB");
        lIlllIIlllII[lIlllIlllllI[199]] = lllIlIlllllIIl("pMK7+B+WA4IFiiUZvxpLoQ==", "nonXl");
        lIlllIIlllII[lIlllIlllllI[200]] = lllIlIlllllllI("PTwCAwgXKBERDg0=", "yNcdg");
        lIlllIIlllII[lIlllIlllllI[201]] = lllIlIlllllIIl("2CXP7QrauCYGbKb24vzgNav22wdOdOZk", "mpRZt");
        lIlllIIlllII[lIlllIlllllI[203]] = lllIlIlllllIIl("D+033SErmeU=", "qqwRz");
        lIlllIIlllII[lIlllIlllllI[204]] = lllIlIllllllIl("sRo3kulOW70=", "gdhhm");
        lIlllIIlllII[lIlllIlllllI[206]] = lllIlIllllllIl("BYSBhR27z1kNf5NG1BLS4Q==", "acOcC");
        lIlllIIlllII[lIlllIlllllI[207]] = lllIlIlllllIIl("lR6yeYQh6AIS2d/Aelf8Ng==", "JNmCJ");
        lIlllIIlllII[lIlllIlllllI[208]] = lllIlIlllllllI("Fh4uFDEpUTkUJjIY", "FqZuE");
        lIlllIIlllII[lIlllIlllllI[210]] = lllIlIlllllllI("JhMqGw==", "rVkPh");
        lIlllIIlllII[lIlllIlllllI[211]] = lllIlIlllllllI("Gg87Mg==", "NjZYW");
        lIlllIIlllII[lIlllIlllllI[214]] = lllIlIlllllIIl("ONuU+INncarUk2cVEXMLZg==", "ANEXp");
        lIlllIIlllII[lIlllIlllllI[215]] = lllIlIlllllIIl("QzzDZDZWmOelqdmu30q6Ug==", "eYJHX");
        lIlllIIlllII[lIlllIlllllI[217]] = lllIlIllllllIl("a09Fj9HSWGA=", "MjEYt");
        lIlllIIlllII[lIlllIlllllI[218]] = lllIlIllllllIl("2NkZfvMQNq4=", "HuYje");
        lIlllIIlllII[lIlllIlllllI[220]] = lllIlIlllllllI("KxkYOQU=", "bXKvW");
        lIlllIIlllII[lIlllIlllllI[221]] = lllIlIlllllIIl("8ni9vF2TZVE=", "MxQDp");
        lIlllIIlllII[lIlllIlllllI[223]] = lllIlIlllllllI("ATE8PC0Z", "Jcsrb");
        lIlllIIlllII[lIlllIlllllI[224]] = lllIlIlllllIIl("KCHBHplU7yg=", "VvWhS");
        lIlllIIlllII[lIlllIlllllI[174]] = lllIlIlllllllI("EC4rBTUGLw==", "CkjRp");
        lIlllIIlllII[lIlllIlllllI[226]] = lllIlIlllllllI("PigCBjcIKQ==", "mMcqR");
        lIlllIIlllII[lIlllIlllllI[228]] = lllIlIlllllIIl("7/LmJhgppxo=", "NpLzN");
        lIlllIIlllII[lIlllIlllllI[229]] = lllIlIllllllIl("2lK77/YZ0dQ=", "UBHYp");
        lIlllIIlllII[lIlllIlllllI[231]] = lllIlIlllllllI("NwIwCRw1GC4=", "zWcAN");
        lIlllIIlllII[lIlllIlllllI[232]] = lllIlIllllllIl("l/rZ4MH40PfYXtwI9AjZ7g==", "EVavv");
        lIlllIIlllII[lIlllIlllllI[234]] = lllIlIlllllllI("DyEHKi0JKwUoLQ==", "MdKfl");
        lIlllIIlllII[lIlllIlllllI[235]] = lllIlIlllllIIl("iVGf4nWmhVCyHOCLcMBrMQ==", "nNnHo");
        lIlllIIlllII[lIlllIlllllI[237]] = lllIlIlllllIIl("0BnBKlvVw7Y=", "ezLWw");
        lIlllIIlllII[lIlllIlllllI[238]] = lllIlIlllllIIl("nApTOxIaWlU=", "AqUos");
        lIlllIIlllII[lIlllIlllllI[240]] = lllIlIlllllllI("PAMbNgY7DAY2Cio=", "oSRdO");
        lIlllIIlllII[lIlllIlllllI[241]] = lllIlIllllllIl("RpnnAzb4ubfUyhF6Q3FZ2Q==", "DDAwe");
        lIlllIIlllII[lIlllIlllllI[244]] = lllIlIllllllIl("zqJP2hHIZ0i702lCyY9rbw==", "DpUQZ");
        lIlllIIlllII[lIlllIlllllI[245]] = lllIlIlllllllI("MSIICR0GNREb", "rGdhn");
        lIlllIIlllII[lIlllIlllllI[246]] = lllIlIllllllIl("YhZeHgVFLU1hcnfMfZ3pqg==", "ZXqiX");
        lIlllIIlllII[lIlllIlllllI[248]] = lllIlIllllllIl("MfF8yOXtXXg=", "OhaQc");
        lIlllIIlllII[lIlllIlllllI[249]] = lllIlIlllllllI("FgIpJDorAw==", "DgMSU");
        lIlllIIlllII[lIlllIlllllI[250]] = lllIlIlllllllI("Ag49PiI/D3k9PzUO", "PkYIM");
        lIlllIIlllII[lIlllIlllllI[252]] = lllIlIllllllIl("kMAVo3aA3zQ=", "CuUym");
        lIlllIIlllII[lIlllIlllllI[253]] = lllIlIlllllllI("IxA1JjwZHA==", "kuFVS");
        lIlllIIlllII[lIlllIlllllI[255]] = lllIlIlllllIIl("+vW9SCiDGLB4/231eGl6fw==", "zgCZd");
        lIlllIIlllII[lIlllIlllllI[256]] = lllIlIlllllllI("KQoQICcLFEknIQ8d", "jxiSS");
        lIlllIIlllII[lIlllIlllllI[258]] = lllIlIllllllIl("UCe1U164Lf6ykL8Tr0k/0gw0j6gzmt1N", "TLLDF");
        lIlllIIlllII[lIlllIlllllI[259]] = lllIlIlllllIIl("wr6yW6cuuL6jSkckI5mJuQ==", "fcatL");
        lIlllIIlllII[lIlllIlllllI[261]] = lllIlIllllllIl("mV0emr5v5Wg=", "nAbQs");
        lIlllIIlllII[lIlllIlllllI[262]] = lllIlIlllllIIl("sCxSIgiwGW0=", "yeoyq");
        lIlllIIlllII[lIlllIlllllI[264]] = lllIlIlllllllI("GDg+LjkIIiM7JBg5", "Kmnkk");
        lIlllIIlllII[lIlllIlllllI[265]] = lllIlIlllllIIl("D255VST6Up/nmT27c3uMfQ==", "PwMwG");
        lIlllIIlllII[lIlllIlllllI[267]] = lllIlIlllllIIl("hIoAH0siUvO/h0SzWkDsbg==", "cxTUF");
        lIlllIIlllII[lIlllIlllllI[268]] = lllIlIlllllIIl("Wf01R0mTfQEpiEx/En5Zew==", "jMRqr");
        lIlllIIlllII[lIlllIlllllI[270]] = lllIlIllllllIl("9WMbgocPMPQNOsFufaRQHA==", "NScmC");
        lIlllIIlllII[lIlllIlllllI[271]] = lllIlIllllllIl("hH8tTyzsqWCMKaOiDMXxMw==", "lLSkY");
        lIlllIIlllII[lIlllIlllllI[273]] = lllIlIllllllIl("Wt8TBUsVNN6U27lLumGp/4cGYk8Ifc+f", "hyhFk");
        lIlllIIlllII[lIlllIlllllI[274]] = lllIlIllllllIl("BmiyTBYY16SLMBVMZ9OkNdOK2OXgLPL0", "gxGbK");
        lIlllIIlllII[lIlllIlllllI[275]] = lllIlIllllllIl("MrcNZwNK0kiMoxPshiwtLQ==", "nDynf");
        lIlllIIlllII[lIlllIlllllI[276]] = lllIlIllllllIl("qOQkqVLvOoA=", "EBGMk");
        lIlllIIlllII[lIlllIlllllI[277]] = lllIlIllllllIl("wf8OFc+zI0Rw5taNP2i4oicLcr1e4BvD", "NkWze");
        lIlllIIlllII[lIlllIlllllI[278]] = lllIlIlllllIIl("Qq9NC+4FfdwRiGeRXPODdA==", "vwLeV");
        lIlllIIlllII[lIlllIlllllI[279]] = lllIlIlllllIIl("lGXboGqrvi3SUBo0Mjo9Fx5+NIf9VizI", "YCfuv");
        lIlllIIlllII[lIlllIlllllI[280]] = lllIlIlllllIIl("KpVXsfR+Bc/i+Edu3Dpd4A==", "goqQV");
        lIlllIIlllII[lIlllIlllllI[281]] = lllIlIlllllIIl("baNhqENi85eVt/bdR2FRR7gz62fLqjS+", "GghBe");
        lIlllIIlllII[lIlllIlllllI[282]] = lllIlIlllllllI("HgsTFwQiRDMMDC0QCA==", "Ldgca");
    }

    public String k() {
        return this.contractName;
    }

    private EnumC0021au(String str, int i, String str2, int i2, int i3, int i4) {
        this(str, i, str2, str2, null, i2, i3, i4, lIlllIlllllI[0], lIlllIlllllI[1]);
    }

    public P bh() {
        return this.patchImplementation;
    }

    private EnumC0021au(String str, int i, String str2, int i2, int i3, int i4, int i5, int i6) {
        this(str, i, str2, str2, null, i2, i3, i4, i5, i6);
    }

    private static void lllIlllIIIIlll() {
        lIlllIlllllI = new int[284];
        lIlllIlllllI[0] = ((227 ^ 164) ^ (208 ^ 152)) & (((175 ^ 190) ^ (98 ^ 124)) ^ (-" ".length()));
        lIlllIlllllI[1] = " ".length();
        lIlllIlllllI[2] = (-((-6563) & 14843)) & (-16385) & 30719;
        lIlllIlllllI[3] = 20 ^ 17;
        lIlllIlllllI[4] = 96 ^ 100;
        lIlllIlllllI[5] = "  ".length();
        lIlllIlllllI[6] = "   ".length();
        lIlllIlllllI[7] = (-((-1927) & 26583)) & (-2049) & 32763;
        lIlllIlllllI[8] = (116 ^ 76) ^ (160 ^ 158);
        lIlllIlllllI[9] = (-((-369) & 29050)) & (-97) & 30719;
        lIlllIlllllI[10] = 50 ^ 56;
        lIlllIlllllI[11] = 27 ^ 28;
        lIlllIlllllI[12] = 103 ^ 111;
        lIlllIlllllI[13] = (((115 + 134) - 124) + 23) ^ (((45 + 89) - 13) + 36);
        lIlllIlllllI[14] = (-((-2565) & 31301)) & (-9) & 30701;
        lIlllIlllllI[15] = 97 ^ 106;
        lIlllIlllllI[16] = (35 ^ 11) ^ (7 ^ 35);
        lIlllIlllllI[17] = (-((-1889) & 30577)) & (-2113) & 32765;
        lIlllIlllllI[18] = 120 ^ 117;
        lIlllIlllllI[19] = 115 ^ 125;
        lIlllIlllllI[20] = (21 ^ 26) ^ ((120 ^ 97) & ((177 ^ 168) ^ (-1)));
        lIlllIlllllI[21] = (-((-1718) & 14071)) & (-18433) & 32767;
        lIlllIlllllI[22] = 4 ^ 20;
        lIlllIlllllI[23] = 55 ^ 38;
        lIlllIlllllI[24] = (-24713) & 30698;
        lIlllIlllllI[25] = 148 ^ 134;
        lIlllIlllllI[26] = 147 ^ 128;
        lIlllIlllllI[27] = (245 ^ 160) ^ (86 ^ 23);
        lIlllIlllllI[28] = (-((-12689) & 31231)) & (-530) & 24575;
        lIlllIlllllI[29] = (1 ^ 42) ^ (187 ^ 133);
        lIlllIlllllI[30] = 156 ^ 138;
        lIlllIlllllI[31] = 117 ^ 98;
        lIlllIlllllI[32] = (-24737) & 30718;
        lIlllIlllllI[33] = (115 ^ 61) ^ (244 ^ 162);
        lIlllIlllllI[34] = 81 ^ 72;
        lIlllIlllllI[35] = (((37 ^ 101) + (((21 + 73) - (-5)) + 57)) - (((8 + 19) - (-79)) + 61)) + ((32 + 166) - 29) + 9;
        lIlllIlllllI[36] = 172 ^ 182;
        lIlllIlllllI[37] = (87 ^ 71) ^ (82 ^ 89);
        lIlllIlllllI[38] = 124 ^ 96;
        lIlllIlllllI[39] = (-((-5843) & 16087)) & (-16385) & 32638;
        lIlllIlllllI[40] = 106 ^ 119;
        lIlllIlllllI[41] = (((123 + 46) - 75) + 74) ^ (((28 + 136) - 125) + 143);
        lIlllIlllllI[42] = (-2050) & 8063;
        lIlllIlllllI[43] = 116 ^ 107;
        lIlllIlllllI[44] = 82 ^ 114;
        lIlllIlllllI[45] = "  ".length() ^ (41 ^ 10);
        lIlllIlllllI[46] = (-((-21558) & 23735)) & (-3) & 8191;
        lIlllIlllllI[47] = 4 ^ 38;
        lIlllIlllllI[48] = (((36 + 10) - 18) + 104) ^ (((113 + 128) - 122) + 48);
        lIlllIlllllI[49] = (-(((29 + 122) - 147) + 225)) & (-20489) & 22509;
        lIlllIlllllI[50] = 90 ^ 126;
        lIlllIlllllI[51] = (((29 + 64) - (-91)) + 4) ^ (((44 + 115) - 98) + 92);
        lIlllIlllllI[52] = (((11 + 18) - (-78)) + 47) ^ (((172 + 12) - 67) + 71);
        lIlllIlllllI[53] = ((14 + 171) - 28) + 68;
        lIlllIlllllI[54] = (((105 + 8) - 68) + 84) ^ (((142 + 124) - 231) + 131);
        lIlllIlllllI[55] = 41 ^ 1;
        lIlllIlllllI[56] = 232 ^ 193;
        lIlllIlllllI[57] = (-1124) & 24055;
        lIlllIlllllI[58] = 91 ^ 113;
        lIlllIlllllI[59] = (((162 + 51) - 95) + 114) ^ (((105 + 7) - (-15)) + 68);
        lIlllIlllllI[60] = 62 ^ 18;
        lIlllIlllllI[61] = (-((-4025) & 28601)) & (-1) & 26527;
        lIlllIlllllI[62] = 112 ^ 93;
        lIlllIlllllI[63] = 90 ^ 116;
        lIlllIlllllI[64] = (((128 + 45) - 121) + 116) ^ (((101 + 72) - 129) + 91);
        lIlllIlllllI[65] = (-((-13969) & 14229)) & (-1033) & 2045;
        lIlllIlllllI[66] = (((177 + 82) - 152) + 73) ^ (((117 + 31) - 53) + 37);
        lIlllIlllllI[67] = (((122 + 9) - 10) + 7) ^ (((158 + 121) - 264) + 162);
        lIlllIlllllI[68] = (74 ^ 1) ^ (121 ^ 0);
        lIlllIlllllI[69] = (-1025) & 3150;
        lIlllIlllllI[70] = 86 ^ 101;
        lIlllIlllllI[71] = (195 ^ 138) ^ (211 ^ 174);
        lIlllIlllllI[72] = 42 ^ 31;
        lIlllIlllllI[73] = ((221 + 164) - 257) + 119;
        lIlllIlllllI[74] = (((130 + 28) - (-20)) + 69) ^ (((61 + 73) - 0) + 59);
        lIlllIlllllI[75] = (17 ^ 46) ^ (205 ^ 197);
        lIlllIlllllI[76] = (126 ^ 8) ^ (32 ^ 110);
        lIlllIlllllI[77] = ((135 + 152) - 257) + 209;
        lIlllIlllllI[78] = 72 ^ 113;
        lIlllIlllllI[79] = 8 ^ 50;
        lIlllIlllllI[80] = (((109 + 50) - 155) + 141) ^ (((58 + 165) - 125) + 72);
        lIlllIlllllI[81] = (-(84 ^ 97)) & (-66) & 6135;
        lIlllIlllllI[82] = (171 ^ 157) ^ (80 ^ 90);
        lIlllIlllllI[83] = 126 ^ 67;
        lIlllIlllllI[84] = (-((-8005) & 32709)) & (-2) & 30711;
        lIlllIlllllI[85] = (230 ^ 135) ^ (241 ^ 174);
        lIlllIlllllI[86] = 76 ^ 115;
        lIlllIlllllI[87] = (-8214) & 14207;
        lIlllIlllllI[88] = 66 ^ 2;
        lIlllIlllllI[89] = 235 ^ 170;
        lIlllIlllllI[90] = (-(((73 + 32) - 55) + 95)) & (-10244) & 16383;
        lIlllIlllllI[91] = (195 ^ 163) ^ (100 ^ 70);
        lIlllIlllllI[92] = (234 ^ 165) ^ (41 ^ 37);
        lIlllIlllllI[93] = (-16469) & 22399;
        lIlllIlllllI[94] = (54 ^ 37) ^ (145 ^ 198);
        lIlllIlllllI[95] = 213 ^ 144;
        lIlllIlllllI[96] = (-((-25537) & 27602)) & (-24705) & 32767;
        lIlllIlllllI[97] = 199 ^ 129;
        lIlllIlllllI[98] = (3 ^ 122) ^ (119 ^ 73);
        lIlllIlllllI[99] = (-2182) & 8181;
        lIlllIlllllI[100] = (((170 + 162) - 94) + 10) ^ (((48 + 88) - 59) + 99);
        lIlllIlllllI[101] = (((202 + 238) - 260) + 73) ^ (((23 + 153) - 124) + 128);
        lIlllIlllllI[102] = (-24589) & 30590;
        lIlllIlllllI[103] = 108 ^ 38;
        lIlllIlllllI[104] = 142 ^ 197;
        lIlllIlllllI[105] = ((109 + 160) - 251) + 231;
        lIlllIlllllI[106] = 8 ^ 68;
        lIlllIlllllI[107] = 1 ^ 76;
        lIlllIlllllI[108] = ((147 + 217) - 272) + 159;
        lIlllIlllllI[109] = (251 ^ 179) ^ (192 ^ 198);
        lIlllIlllllI[110] = 195 ^ 140;
        lIlllIlllllI[111] = ((118 + 17) - 43) + 161;
        lIlllIlllllI[112] = 215 ^ 135;
        lIlllIlllllI[113] = 211 ^ 130;
        lIlllIlllllI[114] = (((((20 + 63) - (-40)) + 33) + (161 ^ 197)) - (((110 + 14) - (-21)) + 40)) + ((88 + 151) - 142) + 87;
        lIlllIlllllI[115] = (195 ^ 156) ^ (171 ^ 166);
        lIlllIlllllI[116] = (((0 + 15) - (-92)) + 100) ^ (((3 + 103) - 37) + 87);
        lIlllIlllllI[117] = (-((-345) & 24573)) & (-89) & 24573;
        lIlllIlllllI[118] = 10 ^ 94;
        lIlllIlllllI[119] = (((181 + 55) - 48) + 44) ^ (((30 + 71) - 55) + 143);
        lIlllIlllllI[120] = (-((-7075) & 32683)) & (-4098) & 32703;
        lIlllIlllllI[121] = (199 ^ 156) ^ (42 ^ 39);
        lIlllIlllllI[122] = (193 ^ 175) ^ (1 ^ 56);
        lIlllIlllllI[123] = (-24605) & 24863;
        lIlllIlllllI[124] = 207 ^ 151;
        lIlllIlllllI[125] = 224 ^ 185;
        lIlllIlllllI[126] = (-12811) & 13071;
        lIlllIlllllI[127] = 83 ^ 9;
        lIlllIlllllI[128] = 255 ^ 164;
        lIlllIlllllI[129] = (-((-7073) & 31721)) & (-4129) & 29039;
        lIlllIlllllI[130] = 111 ^ 51;
        lIlllIlllllI[131] = 52 ^ 105;
        lIlllIlllllI[132] = (-25604) & 28603;
        lIlllIlllllI[133] = 73 ^ 23;
        lIlllIlllllI[134] = (((209 + 173) - 269) + 97) ^ (((17 + 30) - (-51)) + 43);
        lIlllIlllllI[135] = (-((-17585) & 21751)) & (-18481) & 22911;
        lIlllIlllllI[136] = 53 ^ 85;
        lIlllIlllllI[137] = 62 ^ 95;
        lIlllIlllllI[138] = (-29701) & 32181;
        lIlllIlllllI[139] = (22 ^ 0) ^ (66 ^ 54);
        lIlllIlllllI[140] = (110 ^ 39) ^ (171 ^ 129);
        lIlllIlllllI[141] = (-23109) & 23375;
        lIlllIlllllI[142] = (((38 + 29) - (-147)) + 15) ^ (((33 + 120) - 130) + 106);
        lIlllIlllllI[143] = (150 ^ 165) ^ (146 ^ 196);
        lIlllIlllllI[144] = (-14467) & 14735;
        lIlllIlllllI[145] = (25 ^ 66) ^ (255 ^ 194);
        lIlllIlllllI[146] = 54 ^ 81;
        lIlllIlllllI[147] = (-16387) & 19647;
        lIlllIlllllI[148] = (((60 + 43) - 70) + 181) ^ (((38 + 144) - (-5)) + 3);
        lIlllIlllllI[149] = (83 ^ 92) ^ (208 ^ 182);
        lIlllIlllllI[150] = (((114 + 137) - 138) + 112) ^ (((63 + 90) - 43) + 29);
        lIlllIlllllI[151] = (((233 + 98) - 215) + 137) ^ (((106 + 134) - 139) + 49);
        lIlllIlllllI[152] = (90 ^ 9) ^ (71 ^ 120);
        lIlllIlllllI[153] = (-((-1723) & 24255)) & (-11) & 24063;
        lIlllIlllllI[154] = 250 ^ 151;
        lIlllIlllllI[155] = 26 ^ 116;
        lIlllIlllllI[156] = (72 ^ 86) ^ (18 ^ 99);
        lIlllIlllllI[157] = (-2561) & 4079;
        lIlllIlllllI[158] = 83 ^ 35;
        lIlllIlllllI[159] = 23 ^ 102;
        lIlllIlllllI[160] = (((153 + 125) - 163) + 129) ^ (((62 + 81) - 53) + 44);
        lIlllIlllllI[161] = (-((-277) & 22807)) & (-17) & 24063;
        lIlllIlllllI[162] = (((159 + 152) - 211) + 78) ^ (((30 + 45) - 68) + 186);
        lIlllIlllllI[163] = 53 ^ 65;
        lIlllIlllllI[164] = 253 ^ 136;
        lIlllIlllllI[165] = (-((-331) & 6987)) & (-17) & 8187;
        lIlllIlllllI[166] = (99 ^ 21) ^ ((39 ^ 100) & ((229 ^ 166) ^ (-1)));
        lIlllIlllllI[167] = 213 ^ 162;
        lIlllIlllllI[168] = (((153 + 41) - 185) + 200) ^ (((86 + 26) - 41) + 98);
        lIlllIlllllI[169] = (-((-1687) & 30359)) & (-2579) & 32763;
        lIlllIlllllI[170] = 36 ^ 93;
        lIlllIlllllI[171] = (((22 + 203) - 130) + 132) ^ (((77 + 56) - 26) + 46);
        lIlllIlllllI[172] = 54 ^ 77;
        lIlllIlllllI[173] = (-((-5357) & 15613)) & (-16449) & 28659;
        lIlllIlllllI[174] = (((56 ^ 106) + (((31 + 138) - 105) + 84)) - (((139 + 76) - 80) + 9)) + (192 ^ 138);
        lIlllIlllllI[175] = 47 ^ 83;
        lIlllIlllllI[176] = 224 ^ 157;
        lIlllIlllllI[177] = (((141 + 96) - 171) + 158) ^ (((82 + 98) - 147) + 125);
        lIlllIlllllI[178] = (-((-2561) & 6741)) & (-26625) & 32767;
        lIlllIlllllI[179] = (((38 ^ 74) + (177 ^ 185)) - (224 ^ 134)) + (225 ^ 144);
        lIlllIlllllI[180] = ((42 + 112) - 153) + 127;
        lIlllIlllllI[181] = ((22 + 112) - 38) + 33;
        lIlllIlllllI[182] = (-26370) & 28477;
        lIlllIlllllI[183] = ((8 + 120) - 17) + 19;
        lIlllIlllllI[184] = (((93 ^ 59) + (74 ^ 59)) - (((35 + 70) - 22) + 53)) + (112 ^ 68);
        lIlllIlllllI[185] = (((50 ^ 37) + (14 ^ 16)) - (-(27 ^ 18))) + (102 ^ 32);
        lIlllIlllllI[186] = (-((-1115) & 11487)) & (-16417) & 32758;
        lIlllIlllllI[187] = ((1 + 70) - 50) + 112;
        lIlllIlllllI[188] = ((64 + 22) - 70) + 118;
        lIlllIlllllI[189] = (((219 ^ 143) + (218 ^ 159)) - (229 ^ 155)) + (199 ^ 171);
        lIlllIlllllI[190] = (-26558) & 28671;
        lIlllIlllllI[191] = (((48 ^ 22) + (190 ^ 136)) - (-(174 ^ 184))) + (71 ^ 81);
        lIlllIlllllI[192] = (((242 ^ 180) + (((123 + 96) - 180) + 93)) - (((100 + 158) - 213) + 114)) + (211 ^ 141);
        lIlllIlllllI[193] = ((49 + 52) - 77) + 114;
        lIlllIlllllI[194] = (-((-21890) & 32141)) & (-16385) & 32607;
        lIlllIlllllI[195] = (((204 ^ 174) + (54 ^ 120)) - (((26 + 55) - 54) + 135)) + (7 ^ 122);
        lIlllIlllllI[196] = (((7 ^ 105) + (((37 + 109) - 117) + 99)) - (((89 + 87) - 26) + 4)) + (4 ^ 60);
        lIlllIlllllI[197] = ((13 + 97) - (-3)) + 28;
        lIlllIlllllI[198] = (-8225) & 14198;
        lIlllIlllllI[199] = ((77 + 42) - 13) + 36;
        lIlllIlllllI[200] = (((219 ^ 181) + (((124 + 121) - 192) + 82)) - (((33 + 76) - 60) + 163)) + (170 ^ 196);
        lIlllIlllllI[201] = (((44 ^ 85) + (36 ^ 123)) - (((113 + 69) - 116) + 79)) + (236 ^ 165);
        lIlllIlllllI[202] = (-1545) & 24473;
        lIlllIlllllI[203] = (((76 ^ 66) + (54 ^ 102)) - (-(59 ^ 61))) + (182 ^ 155);
        lIlllIlllllI[204] = ((25 + 143) - 75) + 53;
        lIlllIlllllI[205] = (-8245) & 14260;
        lIlllIlllllI[206] = ((94 + 66) - 107) + 94;
        lIlllIlllllI[207] = ((115 + 124) - 236) + 145;
        lIlllIlllllI[208] = (((((109 + 4) - 70) + 97) + (61 ^ 102)) - (((217 + 108) - 191) + 85)) + ((15 + 15) - 5) + 112;
        lIlllIlllllI[209] = (-((-353) & 25597)) & (-4354) & 32735;
        lIlllIlllllI[210] = ((138 + 34) - 103) + 81;
        lIlllIlllllI[211] = ((137 + 79) - 205) + 140;
        lIlllIlllllI[212] = (-8769) & 15101;
        lIlllIlllllI[213] = (-((-4441) & 23898)) & (-91) & 20187;
        lIlllIlllllI[214] = (((((81 + 26) - (-17)) + 12) + (((77 + 50) - 121) + 131)) - (((87 + 99) - 92) + 37)) + (8 ^ 2);
        lIlllIlllllI[215] = (((197 ^ 170) + (10 ^ 20)) - (100 ^ 116)) + (18 ^ 14);
        lIlllIlllllI[216] = (-((-6289) & 32467)) & (-1) & 32510;
        lIlllIlllllI[217] = (((17 ^ 9) + (30 ^ 12)) - (-(47 ^ 24))) + (163 ^ 154);
        lIlllIlllllI[218] = (((147 ^ 157) + (163 ^ 197)) - (-(11 ^ 19))) + (174 ^ 161);
        lIlllIlllllI[219] = (-((-2441) & 4044)) & (-33) & 24575;
        lIlllIlllllI[220] = ((136 + 24) - 28) + 24;
        lIlllIlllllI[221] = (((126 ^ 30) + (151 ^ 179)) - (18 ^ 21)) + (33 ^ 1);
        lIlllIlllllI[222] = (-((-27019) & 28591)) & (-1) & 24511;
        lIlllIlllllI[223] = ((128 + 102) - 76) + 4;
        lIlllIlllllI[224] = (((133 ^ 172) + (((74 + 48) - 21) + 48)) - (((105 + 41) - 26) + 26)) + (36 ^ 87);
        lIlllIlllllI[225] = (-((-21851) & 30587)) & (-2) & 31675;
        lIlllIlllllI[226] = (("  ".length() + (89 ^ 66)) - (-(9 ^ 125))) + (128 ^ 144);
        lIlllIlllllI[227] = (-((-4305) & 6652)) & (-709) & 24559;
        lIlllIlllllI[228] = (((((63 + 108) - 81) + 54) + (110 ^ 72)) - (((11 + 77) - 4) + 65)) + ((66 + 42) - 11) + 32;
        lIlllIlllllI[229] = ((158 + 9) - 43) + 39;
        lIlllIlllllI[230] = (-8209) & 10195;
        lIlllIlllllI[231] = ((54 + 71) - 62) + 101;
        lIlllIlllllI[232] = (((42 ^ 78) + (74 ^ 56)) - (((124 + 166) - 123) + 28)) + ((4 + 68) - 31) + 105;
        lIlllIlllllI[233] = (-((-12033) & 28553)) & (-2049) & 24572;
        lIlllIlllllI[234] = ((139 + 27) - 71) + 71;
        lIlllIlllllI[235] = (((30 ^ 49) + (((82 + 21) - 92) + 144)) - (104 ^ 12)) + (207 ^ 142);
        lIlllIlllllI[236] = (-5250) & 7647;
        lIlllIlllllI[237] = ((18 + 6) - 9) + 153;
        lIlllIlllllI[238] = (((111 ^ 69) + (114 ^ 0)) - (129 ^ 157)) + (88 ^ 113);
        lIlllIlllllI[239] = (-((-1411) & 9603)) & (-2212) & 16383;
        lIlllIlllllI[240] = ((39 + 91) - (-17)) + 23;
        lIlllIlllllI[241] = (((123 ^ 55) + (((123 + 89) - 87) + 20)) - (254 ^ 144)) + (88 ^ 100);
        lIlllIlllllI[242] = (-((-14989) & 31373)) & (-2049) & 24495;
        lIlllIlllllI[243] = (-25618) & 25937;
        lIlllIlllllI[244] = ((" ".length() + (227 ^ 140)) - (-(25 ^ 29))) + (112 ^ 72);
        lIlllIlllllI[245] = ((120 + 117) - 179) + 115;
        lIlllIlllllI[246] = (((((105 + 80) - 141) + 86) + (71 ^ 80)) - (84 ^ 114)) + (36 ^ 31);
        lIlllIlllllI[247] = (-4241) & 5631;
        lIlllIlllllI[248] = (((((47 + 47) - 71) + 147) + (90 ^ 20)) - (((50 + 160) - 185) + 177)) + ((93 + 20) - 71) + 87;
        lIlllIlllllI[249] = ((99 + 109) - 187) + 155;
        lIlllIlllllI[250] = ((8 + 63) - 47) + 153;
        lIlllIlllllI[251] = (-((-17429) & 30271)) & (-257) & 32767;
        lIlllIlllllI[252] = (((((13 + 132) - 30) + 56) + (87 ^ 16)) - (((27 + 134) - 23) + 65)) + ((4 + 19) - (-53)) + 63;
        lIlllIlllllI[253] = ((51 + 24) - (-94)) + 10;
        lIlllIlllllI[254] = (-8521) & 31564;
        lIlllIlllllI[255] = (((111 ^ 121) + (40 ^ 54)) - (-(115 ^ 91))) + (93 ^ 5);
        lIlllIlllllI[256] = ((1 + 129) - 99) + 150;
        lIlllIlllllI[257] = (-(112 ^ 49)) & (-8321) & 32250;
        lIlllIlllllI[258] = ((118 + 12) - (-27)) + 25;
        lIlllIlllllI[259] = (((((123 + 131) - 231) + 127) + (71 ^ 12)) - (((75 + 138) - 65) + 4)) + (123 ^ 21);
        lIlllIlllllI[260] = (-((-645) & 29317)) & (-257) & 32199;
        lIlllIlllllI[261] = (((((97 + 59) - 109) + 82) + (57 ^ 124)) - (((86 + 87) - 93) + 56)) + (185 ^ 195);
        lIlllIlllllI[262] = (((196 ^ 130) + (((31 + 163) - 179) + 160)) - (((5 + 41) - (-35)) + 47)) + (38 ^ 98);
        lIlllIlllllI[263] = (-((-3121) & 27775)) & (-1) & 30686;
        lIlllIlllllI[264] = (((9 ^ 55) + (81 ^ 29)) - (198 ^ 164)) + ((44 + 138) - 168) + 132;
        lIlllIlllllI[265] = ((15 + 31) - 33) + 174;
        lIlllIlllllI[266] = (-8198) & 14231;
        lIlllIlllllI[267] = (((((56 + 116) - 102) + 109) + (141 ^ 195)) - (((53 + 120) - 61) + 33)) + (41 ^ 101);
        lIlllIlllllI[268] = ((97 + 57) - 130) + 165;
        lIlllIlllllI[269] = (-11269) & 32751;
        lIlllIlllllI[270] = (((74 ^ 45) + (86 ^ 77)) - (116 ^ 77)) + (224 ^ 149);
        lIlllIlllllI[271] = (((99 ^ 88) + (32 ^ 44)) - (-(68 ^ 45))) + (26 ^ 21);
        lIlllIlllllI[272] = (-((-22934) & 23455)) & (-1) & 3039;
        lIlllIlllllI[273] = ((153 + 101) - 132) + 70;
        lIlllIlllllI[274] = (((74 ^ 104) + (99 ^ 41)) - (-(120 ^ 98))) + (248 ^ 195);
        lIlllIlllllI[275] = ((144 + 122) - 239) + 167;
        lIlllIlllllI[276] = (((((112 + 97) - 131) + 85) + (58 ^ 55)) - (251 ^ 161)) + (118 ^ 27);
        lIlllIlllllI[277] = ((81 + 105) - 172) + 182;
        lIlllIlllllI[278] = ((144 + 46) - 122) + 129;
        lIlllIlllllI[279] = ((57 + 61) - 96) + 176;
        lIlllIlllllI[280] = ((66 + 130) - 156) + 159;
        lIlllIlllllI[281] = (((202 ^ 142) + (6 ^ 109)) - (-(101 ^ 98))) + (74 ^ 88);
        lIlllIlllllI[282] = (((66 ^ 84) + (123 ^ 125)) - (-(224 ^ 161))) + (84 ^ 56);
        lIlllIlllllI[283] = (((100 ^ 55) + (195 ^ 186)) - (((19 + 76) - (-13)) + 19)) + (202 ^ 183);
    }

    public int bi() {
        return this.tickrate;
    }

    private static boolean lllIlllIIIlIlI(int i) {
        return i != 0;
    }

    private EnumC0021au(String str, int i, String str2, P p, int i2, int i3, int i4, int i5, int i6) {
        this(str, i, str2, str2, p, i2, i3, i4, i5, i6);
    }

    private static boolean lllIlllIIIlIII(int i, int i2) {
        return i < i2;
    }

    private EnumC0021au(String str, int i, String str2, P p, int i2, int i3, int i4) {
        this(str, i, str2, str2, p, i2, i3, i4, lIlllIlllllI[0], lIlllIlllllI[1]);
    }

    @Nullable
    public static EnumC0021au g(int i) {
        EnumC0021au[] values = values();
        int length = values.length;
        int i2 = lIlllIlllllI[0];
        while (lllIlllIIIlIII(i2, length)) {
            EnumC0021au enumC0021au = values[i2];
            if (lllIlllIIIlIIl(enumC0021au.au(), i)) {
                return enumC0021au;
            }
            i2++;
            "".length();
            if (((((32 + 71) - (-65)) + 4) ^ (((124 + 37) - 83) + 90)) < "  ".length()) {
                return null;
            }
        }
        return null;
    }

    public int au() {
        return this.itemID;
    }

    public static EnumC0021au valueOf(String str) {
        return (EnumC0021au) Enum.valueOf(EnumC0021au.class, str);
    }

    private static boolean lllIlllIIIllII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int bc() {
        return this.stages;
    }

    private EnumC0021au(String str, int i, String str2, String str3, P p, int i2, int i3, int i4, int i5, int i6) {
        this.name = str2;
        this.contractName = str3;
        this.patchImplementation = p;
        this.itemID = i2;
        this.tickrate = i3;
        this.stages = i4;
        this.regrowTickrate = i5;
        this.harvestStages = i6;
    }
}
