/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.JEnum;

public final class IEnum
extends Enum<i> {
    public static final /* synthetic */ /* enum */ i MELEE_DRAGON_WARHAMMER_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_2H_CRUSH;
    public static final /* synthetic */ /* enum */ i RANGED_DARTS;
    public static final /* synthetic */ /* enum */ i MELEE_AHRIMS_STAFF_CRUSH;
    public final /* synthetic */ int baseSpellDamage;
    public static final /* synthetic */ /* enum */ i RANGED_RUNE_CROSSBOW;
    public static final /* synthetic */ /* enum */ i RANGED_DRAGON_KNIFE_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_INQUISITORS_MACE;
    public static final /* synthetic */ /* enum */ i MELEE_ZAMORAK_GODSWORD_SPEC;
    public static final /* synthetic */ /* enum */ i MAGIC_STANDARD_WAVE_STAFF;
    public static final /* synthetic */ /* enum */ i RANGED_CROSSBOW_PVP;
    public static final /* synthetic */ /* enum */ i MELEE_SPEAR_CRUSH;
    public static final /* synthetic */ /* enum */ i RANGED_SHORTBOW;
    public static final /* synthetic */ /* enum */ i RANGED_CHINCHOMPA;
    public static final /* synthetic */ /* enum */ i MAGIC_STANDARD_BIND_STAFF;
    public static final /* synthetic */ /* enum */ i MELEE_ABYSSAL_BLUDGEON_CRUSH;
    public static final /* synthetic */ /* enum */ i MELEE_ABYSSAL_DAGGER_STAB;
    public static final /* synthetic */ /* enum */ i MELEE_SCYTHE;
    public static final /* synthetic */ /* enum */ i MELEE_VLS_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_BATTLEAXE_CRUSH;
    public static final /* synthetic */ /* enum */ i RANGED_BLOWPIPE;
    public static final /* synthetic */ /* enum */ i RANGED_RUNE_KNIFE;
    public static final /* synthetic */ /* enum */ i MELEE_VIGGORAS_CHAINMACE;
    public static final /* synthetic */ /* enum */ i MELEE_SWORD_STAB;
    public static final /* synthetic */ /* enum */ i MELEE_GODSWORD_DEFENSIVE;
    public static final /* synthetic */ /* enum */ i MELEE_DAGGER_SLASH;
    public static final /* synthetic */ /* enum */ i MELEE_BATTLEAXE_SLASH;
    public static final /* synthetic */ /* enum */ i RANGED_ZARYTE_CROSSBOW;
    public static final /* synthetic */ /* enum */ i MELEE_KICK;
    public static final /* synthetic */ /* enum */ i MELEE_STAFF_CRUSH_3;
    public static final /* synthetic */ /* enum */ i MELEE_PUNCH;
    public static final /* synthetic */ /* enum */ i MELEE_ARMADYL_GODSWORD_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_SCIM_SLASH;
    private static final /* synthetic */ Map<Integer, i> DATA;
    public static final /* synthetic */ /* enum */ i MAGIC_STANDARD_SURGE_STAFF;
    public static final /* synthetic */ /* enum */ i MELEE_ARMADYL_GODSWORD_OR_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_ZAMORAK_GODSWORD_OR_SPEC;
    public final /* synthetic */ boolean isSpecial;
    public static final /* synthetic */ /* enum */ i RANGED_BALLISTA;
    public static final /* synthetic */ /* enum */ i MELEE_LEAF_BLADED_BATTLEAXE_CRUSH;
    public static final /* synthetic */ /* enum */ i MAGIC_STANDARD_BIND;
    public static final /* synthetic */ /* enum */ i MELEE_GRANITE_MAUL_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_DRAGON_CLAWS_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_FANG_SPEC;
    private static /* synthetic */ String[] lIlIlIIIlIlII;
    public static final /* synthetic */ /* enum */ i RANGED_ZARYTE_CROSSBOW_PVP;
    public static final /* synthetic */ /* enum */ i MELEE_SARADOMIN_GODSWORD_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_MACE_STAB;
    public final /* synthetic */ int animationId;
    public static final /* synthetic */ /* enum */ i MAGIC_TUMEKENS_SHADOW;
    public static final /* synthetic */ /* enum */ i MELEE_ABYSSAL_WHIP;
    public static final /* synthetic */ /* enum */ i RANGED_DRAGON_KNIFE;
    public static final /* synthetic */ /* enum */ i MAGIC_ANCIENT_MULTI_TARGET;
    public static final /* synthetic */ /* enum */ i MELEE_GENERIC_SLASH;
    public static final /* synthetic */ /* enum */ i MELEE_LANCE_SLASH;
    public static final /* synthetic */ /* enum */ i MAGIC_STANDARD_STRIKE_BOLT_BLAST;
    public static final /* synthetic */ /* enum */ i MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_SPEAR_STAB;
    public static final /* synthetic */ /* enum */ i MELEE_GODSWORD_CRUSH;
    public static final /* synthetic */ /* enum */ i RANGED_MAGIC_SHORTBOW_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_LEAF_BLADED_BATTLEAXE_SLASH;
    public static final /* synthetic */ /* enum */ i MELEE_2H_SLASH;
    public static final /* synthetic */ /* enum */ i RANGED_BALLISTA_2;
    public static final /* synthetic */ /* enum */ i MELEE_SARADOMIN_GODSWORD_OR_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_OBBY_MAUL_CRUSH;
    private static final /* synthetic */ i[] $VALUES;
    public static final /* synthetic */ /* enum */ i MELEE_CRYSTAL_HALBERD_SPEC;
    public static final /* synthetic */ /* enum */ i RANGED_DRAGON_KNIFE_POISONED;
    public static final /* synthetic */ /* enum */ i MELEE_DLONG_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_GHAZI_RAPIER_STAB;
    public static final /* synthetic */ /* enum */ i MELEE_GRANITE_MAUL;
    public static final /* synthetic */ /* enum */ i MELEE_DHAROKS_GREATAXE_SLASH;
    public static final /* synthetic */ /* enum */ i RANGED_DRAGON_THROWNAXE_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_LANCE_STAB;
    public static final /* synthetic */ /* enum */ i MELEE_ANCIENT_GODSWORD_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_ELDER_MAUL;
    public static final /* synthetic */ /* enum */ i MELEE_LANCE_CRUSH;
    public static final /* synthetic */ /* enum */ i MELEE_STAFF_SLASH;
    public static final /* synthetic */ /* enum */ i MELEE_STAFF_CRUSH_2;
    public static final /* synthetic */ /* enum */ i MELEE_FANG_STAB;
    public static final /* synthetic */ /* enum */ i MELEE_DRAGON_MACE_SPEC;
    public final /* synthetic */ j attackStyle;
    public static final /* synthetic */ /* enum */ i MELEE_BANDOS_GODSWORD_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_STAFF_STAB;
    public static final /* synthetic */ /* enum */ i MELEE_GODSWORD_SLASH;
    public static final /* synthetic */ /* enum */ i MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF;
    public static final /* synthetic */ /* enum */ i MELEE_STAFF_CRUSH;
    private static /* synthetic */ int[] lIlIlIIIlllII;
    public static final /* synthetic */ /* enum */ i RANGED_RUNE_KNIFE_PVP;
    public static final /* synthetic */ /* enum */ i MAGIC_ANCIENT_SINGLE_TARGET;
    public static final /* synthetic */ /* enum */ i MELEE_BARRELCHEST_ANCHOR_CRUSH;
    public static final /* synthetic */ /* enum */ i MELEE_DHAROKS_GREATAXE_CRUSH;
    public static final /* synthetic */ /* enum */ i MELEE_DRAGON_DAGGER_SPEC;
    public static final /* synthetic */ /* enum */ i MELEE_BANDOS_GODSWORD_OR_SPEC;

    /*
     * WARNING - void declaration
     */
    static {
        block4: {
            void var24;
            i.lIllllIllIIllIl();
            i.lIllllIllIIllII();
            MELEE_VIGGORAS_CHAINMACE = new i(lIlIlIIIlllII[6], j.CRUSH);
            MELEE_DAGGER_SLASH = new i(lIlIlIIIlllII[8], j.SLASH);
            MELEE_SPEAR_STAB = new i(lIlIlIIIlllII[10], j.STAB);
            MELEE_SWORD_STAB = new i(lIlIlIIIlllII[12], j.STAB);
            MELEE_SCIM_SLASH = new i(lIlIlIIIlllII[14], j.SLASH);
            MELEE_LANCE_STAB = new i(lIlIlIIIlllII[16], j.STAB);
            MELEE_LANCE_CRUSH = new i(lIlIlIIIlllII[18], j.CRUSH);
            MELEE_LANCE_SLASH = new i(lIlIlIIIlllII[20], j.SLASH);
            MELEE_FANG_STAB = new i(lIlIlIIIlllII[22], j.STAB);
            MELEE_FANG_SPEC = new i(lIlIlIIIlllII[24], j.STAB, lIlIlIIIlllII[1]);
            MELEE_GENERIC_SLASH = new i(lIlIlIIIlllII[26], j.SLASH);
            MELEE_STAFF_CRUSH = new i(lIlIlIIIlllII[0], j.SLASH);
            MELEE_BATTLEAXE_SLASH = new i(lIlIlIIIlllII[29], j.SLASH);
            MELEE_MACE_STAB = new i(lIlIlIIIlllII[31], j.STAB);
            MELEE_BATTLEAXE_CRUSH = new i(lIlIlIIIlllII[33], j.CRUSH);
            MELEE_2H_CRUSH = new i(lIlIlIIIlllII[35], j.CRUSH);
            MELEE_2H_SLASH = new i(lIlIlIIIlllII[37], j.SLASH);
            MELEE_STAFF_CRUSH_2 = new i(lIlIlIIIlllII[39], j.CRUSH);
            MELEE_STAFF_CRUSH_3 = new i(lIlIlIIIlllII[41], j.CRUSH);
            MELEE_PUNCH = new i(lIlIlIIIlllII[43], j.CRUSH);
            MELEE_KICK = new i(lIlIlIIIlllII[45], j.CRUSH);
            MELEE_STAFF_STAB = new i(lIlIlIIIlllII[47], j.STAB);
            MELEE_SPEAR_CRUSH = new i(lIlIlIIIlllII[49], j.CRUSH);
            MELEE_STAFF_SLASH = new i(lIlIlIIIlllII[51], j.SLASH);
            MELEE_DLONG_SPEC = new i(lIlIlIIIlllII[53], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_DRAGON_MACE_SPEC = new i(lIlIlIIIlllII[55], j.CRUSH, lIlIlIIIlllII[1]);
            MELEE_DRAGON_DAGGER_SPEC = new i(lIlIlIIIlllII[57], j.STAB, lIlIlIIIlllII[1]);
            MELEE_DRAGON_WARHAMMER_SPEC = new i(lIlIlIIIlllII[59], j.CRUSH, lIlIlIIIlllII[1]);
            MELEE_ABYSSAL_WHIP = new i(lIlIlIIIlllII[61], j.SLASH);
            MELEE_GRANITE_MAUL = new i(lIlIlIIIlllII[63], j.CRUSH);
            MELEE_GRANITE_MAUL_SPEC = new i(lIlIlIIIlllII[65], j.CRUSH, lIlIlIIIlllII[1]);
            MELEE_DHAROKS_GREATAXE_CRUSH = new i(lIlIlIIIlllII[67], j.CRUSH);
            MELEE_DHAROKS_GREATAXE_SLASH = new i(lIlIlIIIlllII[69], j.SLASH);
            MELEE_AHRIMS_STAFF_CRUSH = new i(lIlIlIIIlllII[71], j.CRUSH);
            MELEE_OBBY_MAUL_CRUSH = new i(lIlIlIIIlllII[73], j.CRUSH);
            MELEE_ABYSSAL_DAGGER_STAB = new i(lIlIlIIIlllII[75], j.STAB);
            MELEE_ABYSSAL_BLUDGEON_CRUSH = new i(lIlIlIIIlllII[77], j.CRUSH);
            MELEE_LEAF_BLADED_BATTLEAXE_CRUSH = new i(lIlIlIIIlllII[79], j.CRUSH);
            MELEE_INQUISITORS_MACE = new i(lIlIlIIIlllII[81], j.CRUSH);
            MELEE_BARRELCHEST_ANCHOR_CRUSH = new i(lIlIlIIIlllII[83], j.CRUSH);
            MELEE_LEAF_BLADED_BATTLEAXE_SLASH = new i(lIlIlIIIlllII[85], j.SLASH);
            MELEE_GODSWORD_SLASH = new i(lIlIlIIIlllII[87], j.SLASH);
            MELEE_GODSWORD_CRUSH = new i(lIlIlIIIlllII[89], j.CRUSH);
            MELEE_GODSWORD_DEFENSIVE = new i(lIlIlIIIlllII[91], j.SLASH);
            MELEE_DRAGON_CLAWS_SPEC = new i(lIlIlIIIlllII[93], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_VLS_SPEC = new i(lIlIlIIIlllII[95], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_ELDER_MAUL = new i(lIlIlIIIlllII[97], j.CRUSH);
            MELEE_ZAMORAK_GODSWORD_SPEC = new i(lIlIlIIIlllII[99], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_ZAMORAK_GODSWORD_OR_SPEC = new i(lIlIlIIIlllII[101], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_SARADOMIN_GODSWORD_SPEC = new i(lIlIlIIIlllII[103], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_SARADOMIN_GODSWORD_OR_SPEC = new i(lIlIlIIIlllII[105], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_BANDOS_GODSWORD_SPEC = new i(lIlIlIIIlllII[107], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_BANDOS_GODSWORD_OR_SPEC = new i(lIlIlIIIlllII[109], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_ARMADYL_GODSWORD_SPEC = new i(lIlIlIIIlllII[111], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_ARMADYL_GODSWORD_OR_SPEC = new i(lIlIlIIIlllII[113], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_SCYTHE = new i(lIlIlIIIlllII[115], j.SLASH);
            MELEE_GHAZI_RAPIER_STAB = new i(lIlIlIIIlllII[117], j.STAB);
            MELEE_ANCIENT_GODSWORD_SPEC = new i(lIlIlIIIlllII[119], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_CRYSTAL_HALBERD_SPEC = new i(lIlIlIIIlllII[121], j.SLASH, lIlIlIIIlllII[1]);
            RANGED_CHINCHOMPA = new i(lIlIlIIIlllII[123], j.RANGED);
            RANGED_SHORTBOW = new i(lIlIlIIIlllII[125], j.RANGED);
            RANGED_RUNE_KNIFE_PVP = new i(lIlIlIIIlllII[127], j.RANGED);
            RANGED_MAGIC_SHORTBOW_SPEC = new i(lIlIlIIIlllII[129], j.RANGED, lIlIlIIIlllII[1]);
            RANGED_CROSSBOW_PVP = new i(lIlIlIIIlllII[131], j.RANGED);
            RANGED_BLOWPIPE = new i(lIlIlIIIlllII[133], j.RANGED);
            RANGED_DARTS = new i(lIlIlIIIlllII[135], j.RANGED);
            RANGED_BALLISTA = new i(lIlIlIIIlllII[137], j.RANGED);
            RANGED_DRAGON_THROWNAXE_SPEC = new i(lIlIlIIIlllII[139], j.RANGED, lIlIlIIIlllII[1]);
            RANGED_RUNE_CROSSBOW = new i(lIlIlIIIlllII[141], j.RANGED);
            RANGED_BALLISTA_2 = new i(lIlIlIIIlllII[143], j.RANGED);
            RANGED_RUNE_KNIFE = new i(lIlIlIIIlllII[145], j.RANGED);
            RANGED_DRAGON_KNIFE = new i(lIlIlIIIlllII[147], j.RANGED);
            RANGED_DRAGON_KNIFE_POISONED = new i(lIlIlIIIlllII[149], j.RANGED);
            RANGED_DRAGON_KNIFE_SPEC = new i(lIlIlIIIlllII[151], j.RANGED, lIlIlIIIlllII[1]);
            RANGED_ZARYTE_CROSSBOW = new i(lIlIlIIIlllII[153], j.RANGED);
            RANGED_ZARYTE_CROSSBOW_PVP = new i(lIlIlIIIlllII[155], j.RANGED);
            MAGIC_STANDARD_BIND = new i(lIlIlIIIlllII[157], j.MAGIC);
            MAGIC_STANDARD_STRIKE_BOLT_BLAST = new i(lIlIlIIIlllII[159], j.MAGIC, lIlIlIIIlllII[27]);
            MAGIC_STANDARD_BIND_STAFF = new i(lIlIlIIIlllII[161], j.MAGIC);
            MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF = new i(lIlIlIIIlllII[163], j.MAGIC, lIlIlIIIlllII[27]);
            MAGIC_STANDARD_WAVE_STAFF = new i(lIlIlIIIlllII[165], j.MAGIC, lIlIlIIIlllII[34]);
            MAGIC_STANDARD_SURGE_STAFF = new i(lIlIlIIIlllII[167], j.MAGIC, lIlIlIIIlllII[42]);
            MAGIC_ANCIENT_SINGLE_TARGET = new i(lIlIlIIIlllII[169], j.MAGIC, lIlIlIIIlllII[46]);
            MAGIC_ANCIENT_MULTI_TARGET = new i(lIlIlIIIlllII[171], j.MAGIC, lIlIlIIIlllII[54]);
            MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC = new i(lIlIlIIIlllII[173], j.MAGIC, lIlIlIIIlllII[126]);
            MAGIC_TUMEKENS_SHADOW = new i(lIlIlIIIlllII[175], j.MAGIC);
            i[] iArray = new i[lIlIlIIIlllII[166]];
            iArray[i.lIlIlIIIlllII[0]] = MELEE_VIGGORAS_CHAINMACE;
            iArray[i.lIlIlIIIlllII[1]] = MELEE_DAGGER_SLASH;
            iArray[i.lIlIlIIIlllII[2]] = MELEE_SPEAR_STAB;
            iArray[i.lIlIlIIIlllII[3]] = MELEE_SWORD_STAB;
            iArray[i.lIlIlIIIlllII[4]] = MELEE_SCIM_SLASH;
            iArray[i.lIlIlIIIlllII[5]] = MELEE_LANCE_STAB;
            iArray[i.lIlIlIIIlllII[7]] = MELEE_LANCE_CRUSH;
            iArray[i.lIlIlIIIlllII[9]] = MELEE_LANCE_SLASH;
            iArray[i.lIlIlIIIlllII[11]] = MELEE_FANG_STAB;
            iArray[i.lIlIlIIIlllII[13]] = MELEE_FANG_SPEC;
            iArray[i.lIlIlIIIlllII[15]] = MELEE_GENERIC_SLASH;
            iArray[i.lIlIlIIIlllII[17]] = MELEE_STAFF_CRUSH;
            iArray[i.lIlIlIIIlllII[19]] = MELEE_BATTLEAXE_SLASH;
            iArray[i.lIlIlIIIlllII[21]] = MELEE_MACE_STAB;
            iArray[i.lIlIlIIIlllII[23]] = MELEE_BATTLEAXE_CRUSH;
            iArray[i.lIlIlIIIlllII[25]] = MELEE_2H_CRUSH;
            iArray[i.lIlIlIIIlllII[27]] = MELEE_2H_SLASH;
            iArray[i.lIlIlIIIlllII[28]] = MELEE_STAFF_CRUSH_2;
            iArray[i.lIlIlIIIlllII[30]] = MELEE_STAFF_CRUSH_3;
            iArray[i.lIlIlIIIlllII[32]] = MELEE_PUNCH;
            iArray[i.lIlIlIIIlllII[34]] = MELEE_KICK;
            iArray[i.lIlIlIIIlllII[36]] = MELEE_STAFF_STAB;
            iArray[i.lIlIlIIIlllII[38]] = MELEE_SPEAR_CRUSH;
            iArray[i.lIlIlIIIlllII[40]] = MELEE_STAFF_SLASH;
            iArray[i.lIlIlIIIlllII[42]] = MELEE_DLONG_SPEC;
            iArray[i.lIlIlIIIlllII[44]] = MELEE_DRAGON_MACE_SPEC;
            iArray[i.lIlIlIIIlllII[46]] = MELEE_DRAGON_DAGGER_SPEC;
            iArray[i.lIlIlIIIlllII[48]] = MELEE_DRAGON_WARHAMMER_SPEC;
            iArray[i.lIlIlIIIlllII[50]] = MELEE_ABYSSAL_WHIP;
            iArray[i.lIlIlIIIlllII[52]] = MELEE_GRANITE_MAUL;
            iArray[i.lIlIlIIIlllII[54]] = MELEE_GRANITE_MAUL_SPEC;
            iArray[i.lIlIlIIIlllII[56]] = MELEE_DHAROKS_GREATAXE_CRUSH;
            iArray[i.lIlIlIIIlllII[58]] = MELEE_DHAROKS_GREATAXE_SLASH;
            iArray[i.lIlIlIIIlllII[60]] = MELEE_AHRIMS_STAFF_CRUSH;
            iArray[i.lIlIlIIIlllII[62]] = MELEE_OBBY_MAUL_CRUSH;
            iArray[i.lIlIlIIIlllII[64]] = MELEE_ABYSSAL_DAGGER_STAB;
            iArray[i.lIlIlIIIlllII[66]] = MELEE_ABYSSAL_BLUDGEON_CRUSH;
            iArray[i.lIlIlIIIlllII[68]] = MELEE_LEAF_BLADED_BATTLEAXE_CRUSH;
            iArray[i.lIlIlIIIlllII[70]] = MELEE_INQUISITORS_MACE;
            iArray[i.lIlIlIIIlllII[72]] = MELEE_BARRELCHEST_ANCHOR_CRUSH;
            iArray[i.lIlIlIIIlllII[74]] = MELEE_LEAF_BLADED_BATTLEAXE_SLASH;
            iArray[i.lIlIlIIIlllII[76]] = MELEE_GODSWORD_SLASH;
            iArray[i.lIlIlIIIlllII[78]] = MELEE_GODSWORD_CRUSH;
            iArray[i.lIlIlIIIlllII[80]] = MELEE_GODSWORD_DEFENSIVE;
            iArray[i.lIlIlIIIlllII[82]] = MELEE_DRAGON_CLAWS_SPEC;
            iArray[i.lIlIlIIIlllII[84]] = MELEE_VLS_SPEC;
            iArray[i.lIlIlIIIlllII[86]] = MELEE_ELDER_MAUL;
            iArray[i.lIlIlIIIlllII[88]] = MELEE_ZAMORAK_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[90]] = MELEE_ZAMORAK_GODSWORD_OR_SPEC;
            iArray[i.lIlIlIIIlllII[92]] = MELEE_SARADOMIN_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[94]] = MELEE_SARADOMIN_GODSWORD_OR_SPEC;
            iArray[i.lIlIlIIIlllII[96]] = MELEE_BANDOS_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[98]] = MELEE_BANDOS_GODSWORD_OR_SPEC;
            iArray[i.lIlIlIIIlllII[100]] = MELEE_ARMADYL_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[102]] = MELEE_ARMADYL_GODSWORD_OR_SPEC;
            iArray[i.lIlIlIIIlllII[104]] = MELEE_SCYTHE;
            iArray[i.lIlIlIIIlllII[106]] = MELEE_GHAZI_RAPIER_STAB;
            iArray[i.lIlIlIIIlllII[108]] = MELEE_ANCIENT_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[110]] = MELEE_CRYSTAL_HALBERD_SPEC;
            iArray[i.lIlIlIIIlllII[112]] = RANGED_CHINCHOMPA;
            iArray[i.lIlIlIIIlllII[114]] = RANGED_SHORTBOW;
            iArray[i.lIlIlIIIlllII[116]] = RANGED_RUNE_KNIFE_PVP;
            iArray[i.lIlIlIIIlllII[118]] = RANGED_MAGIC_SHORTBOW_SPEC;
            iArray[i.lIlIlIIIlllII[120]] = RANGED_CROSSBOW_PVP;
            iArray[i.lIlIlIIIlllII[122]] = RANGED_BLOWPIPE;
            iArray[i.lIlIlIIIlllII[124]] = RANGED_DARTS;
            iArray[i.lIlIlIIIlllII[126]] = RANGED_BALLISTA;
            iArray[i.lIlIlIIIlllII[128]] = RANGED_DRAGON_THROWNAXE_SPEC;
            iArray[i.lIlIlIIIlllII[130]] = RANGED_RUNE_CROSSBOW;
            iArray[i.lIlIlIIIlllII[132]] = RANGED_BALLISTA_2;
            iArray[i.lIlIlIIIlllII[134]] = RANGED_RUNE_KNIFE;
            iArray[i.lIlIlIIIlllII[136]] = RANGED_DRAGON_KNIFE;
            iArray[i.lIlIlIIIlllII[138]] = RANGED_DRAGON_KNIFE_POISONED;
            iArray[i.lIlIlIIIlllII[140]] = RANGED_DRAGON_KNIFE_SPEC;
            iArray[i.lIlIlIIIlllII[142]] = RANGED_ZARYTE_CROSSBOW;
            iArray[i.lIlIlIIIlllII[144]] = RANGED_ZARYTE_CROSSBOW_PVP;
            iArray[i.lIlIlIIIlllII[146]] = MAGIC_STANDARD_BIND;
            iArray[i.lIlIlIIIlllII[148]] = MAGIC_STANDARD_STRIKE_BOLT_BLAST;
            iArray[i.lIlIlIIIlllII[150]] = MAGIC_STANDARD_BIND_STAFF;
            iArray[i.lIlIlIIIlllII[152]] = MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF;
            iArray[i.lIlIlIIIlllII[154]] = MAGIC_STANDARD_WAVE_STAFF;
            iArray[i.lIlIlIIIlllII[156]] = MAGIC_STANDARD_SURGE_STAFF;
            iArray[i.lIlIlIIIlllII[158]] = MAGIC_ANCIENT_SINGLE_TARGET;
            iArray[i.lIlIlIIIlllII[160]] = MAGIC_ANCIENT_MULTI_TARGET;
            iArray[i.lIlIlIIIlllII[162]] = MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC;
            iArray[i.lIlIlIIIlllII[164]] = MAGIC_TUMEKENS_SHADOW;
            $VALUES = iArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            i[] iArray2 = i.values();
            int n2 = iArray2.length;
            int var13 = lIlIlIIIlllII[0];
            while (i.lIllllIllIlIIIl(var13, (int)var24)) {
                void var10;
                void var5 = var10[var13];
                if (i.lIllllIllIlIIlI(var5.animationId)) {
                    0;
                    
                    }
                } else {
                    void var21;
                    var21.put((Object)var5.animationId, (Object)var5);
                    0;
                }
                ++var13;
                0;
                
                break block4;
            }
            DATA = builder.build();
        }
    }

    private static String lIllllIlIllIlII(String var14, String var23) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var3 = var23.toCharArray();
        int var11 = lIlIlIIIlllII[0];
        char[] var9 = var14.toCharArray();
        int var4 = var9.length;
        int var7 = lIlIlIIIlllII[0];
        while (i.lIllllIllIlIIIl(var7, var4)) {
            char var16 = var9[var7];
            var15.append((char)(var16 ^ var3[var11 % var3.length]));
            0;
            ++var11;
            ++var7;
            0;
            if ((0x65 ^ 0x61) <= (0xA8 ^ 0xAC)) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean lIllllIllIIlllI(Object object) {
        return object == null;
    }

    private static void lIllllIllIIllIl() {
        lIlIlIIIlllII = new int[177];
        i.lIlIlIIIlllII[0] = (0xC9 ^ 0xC3) & ~(0x89 ^ 0x83);
        i.lIlIlIIIlllII[1] = 1;
        i.lIlIlIIIlllII[2] = 2;
        i.lIlIlIIIlllII[3] = 3;
        i.lIlIlIIIlllII[4] = 114 + 107 - 111 + 24 ^ 21 + 83 - 47 + 73;
        i.lIlIlIIIlllII[5] = 109 + 108 - 216 + 146 ^ 25 + 46 - -68 + 11;
        i.lIlIlIIIlllII[6] = 16 + 139 - 56 + 146;
        i.lIlIlIIIlllII[7] = 0x2B ^ 7 ^ (0x8C ^ 0xA6);
        i.lIlIlIIIlllII[8] = 0xFFFFFBFF & 0x578;
        i.lIlIlIIIlllII[9] = 74 + 177 - 201 + 133 ^ 37 + 62 - 97 + 174;
        i.lIlIlIIIlllII[10] = -(0xFFFFF2EB & 0x3F17) & (0xFFFFB77F & 0x7BFF);
        i.lIlIlIIIlllII[11] = 32 + 78 - 84 + 154 ^ 73 + 94 - 152 + 173;
        i.lIlIlIIIlllII[12] = 0xFFFF97AF & 0x69D2;
        i.lIlIlIIIlllII[13] = 0x94 ^ 0x9D;
        i.lIlIlIIIlllII[14] = 0xFFFFDBE6 & 0x259F;
        i.lIlIlIIIlllII[15] = 0x29 ^ 0x23;
        i.lIlIlIIIlllII[16] = -(0xFFFFF73D & 0x4FC7) & (0xFFFFF7EE & 0x6F75);
        i.lIlIlIIIlllII[17] = 0x99 ^ 0x90 ^ 2;
        i.lIlIlIIIlllII[18] = -(0xFFFFDFFF & 0x3C9E) & (0xFFFFFEFF & 0x3DFF);
        i.lIlIlIIIlllII[19] = 0xDF ^ 0x95 ^ (0x2A ^ 0x6C);
        i.lIlIlIIIlllII[20] = -(0xFFFF9D7B & 0x7B9F) & (0xFFFFBDFF & 0x7B7B);
        i.lIlIlIIIlllII[21] = 0x2A ^ 0x27;
        i.lIlIlIIIlllII[22] = 0xFFFFE7FF & 0x3CFF;
        i.lIlIlIIIlllII[23] = 0x16 ^ 0xC ^ (0xA7 ^ 0xB3);
        i.lIlIlIIIlllII[24] = 0xFFFFBFFE & 0x57E7;
        i.lIlIlIIIlllII[25] = 0x96 ^ 0x99;
        i.lIlIlIIIlllII[26] = -(0xFFFFF667 & 0x79DB) & (0xFFFFF9EB & 0x77DF);
        i.lIlIlIIIlllII[27] = 0xAA ^ 0xBA;
        i.lIlIlIIIlllII[28] = (0x2E ^ 0x3C) & ~(0xBF ^ 0xAD) ^ (0x1B ^ 0xA);
        i.lIlIlIIIlllII[29] = -(0xFFFFDC37 & 0x7FF9) & (0xFFFFFFFF & 0x5DBB);
        i.lIlIlIIIlllII[30] = 0x3C ^ 9 ^ (0xA3 ^ 0x84);
        i.lIlIlIIIlllII[31] = -(0xFFFFAD65 & 0x7AFF) & (0xFFFFEDFF & 0x3BF4);
        i.lIlIlIIIlllII[32] = 0xD2 ^ 0xC1;
        i.lIlIlIIIlllII[33] = -(0xFFFFFAA7 & 0x7D7D) & (0xFFFFF9F7 & 0x7FBD);
        i.lIlIlIIIlllII[34] = 0x38 ^ 0x2C;
        i.lIlIlIIIlllII[35] = -(0xFFFFB5FB & 0x6E6D) & (0xFFFFFFFE & 0x25FF);
        i.lIlIlIIIlllII[36] = 0x44 ^ 4 ^ (0xD ^ 0x58);
        i.lIlIlIIIlllII[37] = 0xFFFFCDB7 & 0x33DF;
        i.lIlIlIIIlllII[38] = 0x57 ^ 0x1A ^ (0 ^ 0x5B);
        i.lIlIlIIIlllII[39] = -(0xFFFFB3E7 & 0x6E79) & (0xFFFFAFFE & 0x73FF);
        i.lIlIlIIIlllII[40] = 0x2A ^ 0x3D;
        i.lIlIlIIIlllII[41] = -(0xFFFFEEFF & 0x5D41) & (0xFFFFEDFB & 0x5FE7);
        i.lIlIlIIIlllII[42] = 88 + 72 - 142 + 110 ^ 40 + 120 - 129 + 121;
        i.lIlIlIIIlllII[43] = 0xFFFFA3E7 & 0x5DBE;
        i.lIlIlIIIlllII[44] = 80 + 147 - 67 + 13 ^ 54 + 123 - 145 + 148;
        i.lIlIlIIIlllII[45] = 0xFFFFABF7 & 0x55AF;
        i.lIlIlIIIlllII[46] = 0x92 ^ 0xA6 ^ (0xB2 ^ 0x9C);
        i.lIlIlIIIlllII[47] = -(0xFFFFCB9F & 0x3E63) & (0xFFFFDFAF & 0x2BFE);
        i.lIlIlIIIlllII[48] = 0x87 ^ 0x9C;
        i.lIlIlIIIlllII[49] = -(0xFFFFBFD9 & 0x6E77) & (0xFFFFBFFF & 0x6FFD);
        i.lIlIlIIIlllII[50] = 0x41 ^ 0x79 ^ (0xE3 ^ 0xC7);
        i.lIlIlIIIlllII[51] = 0xFFFFBDFB & 0x43BC;
        i.lIlIlIIIlllII[52] = 0xB ^ 0x16;
        i.lIlIlIIIlllII[53] = -(0xFFFFDFFF & 0x6155) & (0xFFFFF5FE & 0x4F77);
        i.lIlIlIIIlllII[54] = 0x6E ^ 0x4B ^ (0x52 ^ 0x69);
        i.lIlIlIIIlllII[55] = 0xFFFFE577 & 0x1EAC;
        i.lIlIlIIIlllII[56] = 147 + 85 - 96 + 30 ^ 60 + 133 - 96 + 88;
        i.lIlIlIIIlllII[57] = -(0xFFFFBBD9 & 0x7DB7) & (0xFFFFBDF7 & 0x7FBE);
        i.lIlIlIIIlllII[58] = 0x6C ^ 0x4C;
        i.lIlIlIIIlllII[59] = 0xFFFFEDFE & 0x1763;
        i.lIlIlIIIlllII[60] = 0x30 ^ 0x11;
        i.lIlIlIIIlllII[61] = -(0xFFFFA9AE & 0x7FD7) & (0xFFFFEFFF & 0x3FFF);
        i.lIlIlIIIlllII[62] = 0xA ^ 0x17 ^ (0x9B ^ 0xA4);
        i.lIlIlIIIlllII[63] = 0xFFFFB7EF & 0x4E91;
        i.lIlIlIIIlllII[64] = 0xB8 ^ 0x9B;
        i.lIlIlIIIlllII[65] = -(0xFFFFF977 & 0x2FFD) & (0xFFFFAFF7 & Short.MAX_VALUE);
        i.lIlIlIIIlllII[66] = 149 + 2 - 128 + 131 ^ 0 + 68 - -18 + 104;
        i.lIlIlIIIlllII[67] = -(0xFFFFB7BF & 0x6BE6) & (0xFFFFEBB7 & 0x3FFF);
        i.lIlIlIIIlllII[68] = 0x37 ^ 0x39 ^ (0x8A ^ 0xA1);
        i.lIlIlIIIlllII[69] = 0xFFFFFA9B & 0xD77;
        i.lIlIlIIIlllII[70] = 0x20 ^ 0x12 ^ (0xA2 ^ 0xB6);
        i.lIlIlIIIlllII[71] = -(0xFFFFF367 & 0x2DDA) & (0xFFFFBF7F & 0x69DF);
        i.lIlIlIIIlllII[72] = 9 ^ 0x22 ^ (0x54 ^ 0x58);
        i.lIlIlIIIlllII[73] = 0xFFFFBA7F & 0x4FE5;
        i.lIlIlIIIlllII[74] = 1 ^ 0x29;
        i.lIlIlIIIlllII[75] = 0xFFFFCCED & 0x3FF3;
        i.lIlIlIIIlllII[76] = 0x33 ^ 0x1A;
        i.lIlIlIIIlllII[77] = 0xFFFFADE2 & 0x5EFF;
        i.lIlIlIIIlllII[78] = 8 ^ 0x22;
        i.lIlIlIIIlllII[79] = -(119 + 30 - 47 + 125) & (0xFFFFDFEE & 0x2FFF);
        i.lIlIlIIIlllII[80] = 4 ^ 0x2F;
        i.lIlIlIIIlllII[81] = 0xFFFF97DF & 0x79B7;
        i.lIlIlIIIlllII[82] = 21 + 78 - -7 + 21 ^ (0x14 ^ 0x47);
        i.lIlIlIIIlllII[83] = 0xFFFFFFED & 0x16FB;
        i.lIlIlIIIlllII[84] = 0xC5 ^ 0xA6 ^ (0xC9 ^ 0x87);
        i.lIlIlIIIlllII[85] = -(0xFFFFA5AE & 0x7AF3) & (0xFFFFBFFF & 0x7BFD);
        i.lIlIlIIIlllII[86] = 0x6D ^ 0x43;
        i.lIlIlIIIlllII[87] = -(0xFFFFA673 & 0x7DFD) & (0xFFFFFFF7 & 0x3FFD);
        i.lIlIlIIIlllII[88] = 0x91 ^ 0xBE;
        i.lIlIlIIIlllII[89] = -(0xFFFFF67B & 0x2DF5) & (0xFFFFBFFF & 0x7FFE);
        i.lIlIlIIIlllII[90] = 90 + 140 - 116 + 31 ^ 46 + 6 - 27 + 136;
        i.lIlIlIIIlllII[91] = -(0xFFFFB5DD & 0x6E33) & (0xFFFFFFBF & 0x3FDF);
        i.lIlIlIIIlllII[92] = 0x1F ^ 0x2E;
        i.lIlIlIIIlllII[93] = -(0xFFFFAAAB & 0x57F6) & (0xFFFFBFFB & 0x5FFF);
        i.lIlIlIIIlllII[94] = 0xB0 ^ 0x82;
        i.lIlIlIIIlllII[95] = 0xFFFFBF5B & 0x5DFF;
        i.lIlIlIIIlllII[96] = 0xC1 ^ 0xAA ^ (0x2B ^ 0x73);
        i.lIlIlIIIlllII[97] = -(0xFFFFF7B6 & 0x6AED) & (0xFFFFFFFF & Short.MAX_VALUE);
        i.lIlIlIIIlllII[98] = 0xBC ^ 0x88;
        i.lIlIlIIIlllII[99] = -(0xFFFF9B76 & 0x668B) & (0xFFFFDFD7 & 0x3FFF);
        i.lIlIlIIIlllII[100] = 0x34 ^ 1;
        i.lIlIlIIIlllII[101] = -(0xFFFFEDAF & 0x5271) & (0xFFFFDFF7 & 0x7DFF);
        i.lIlIlIIIlllII[102] = 0x78 ^ 0x7C ^ (0x5C ^ 0x6E);
        i.lIlIlIIIlllII[103] = -(0xFFFFA22B & 0x7FD7) & (0xFFFFBFDF & 0x7FFA);
        i.lIlIlIIIlllII[104] = 2 + 82 - 25 + 79 ^ 134 + 117 - 201 + 139;
        i.lIlIlIIIlllII[105] = 0xFFFFFDD9 & 0x1FFF;
        i.lIlIlIIIlllII[106] = 54 + 12 - 60 + 153 ^ 127 + 112 - 94 + 22;
        i.lIlIlIIIlllII[107] = 0xFFFFDFFE & 0x3DDB;
        i.lIlIlIIIlllII[108] = 0 + 116 - 16 + 56 ^ 2 + 157 - 137 + 143;
        i.lIlIlIIIlllII[109] = -(0xFFFFF2ED & 0x6F13) & (0xFFFFFFDF & 0x7FFB);
        i.lIlIlIIIlllII[110] = 64 + 45 - -11 + 10 ^ 72 + 172 - 235 + 175;
        i.lIlIlIIIlllII[111] = -(0xFFFFE377 & 0x7EAB) & (0xFFFFFFFE & Short.MAX_VALUE);
        i.lIlIlIIIlllII[112] = 126 + 98 - 129 + 62 ^ 85 + 23 - 89 + 147;
        i.lIlIlIIIlllII[113] = 0xFFFFDFFD & 0x3DDF;
        i.lIlIlIIIlllII[114] = 0xCE ^ 0x9A ^ (0xD1 ^ 0xB9);
        i.lIlIlIIIlllII[115] = 0xFFFFFFF9 & 0x1F7E;
        i.lIlIlIIIlllII[116] = 96 + 4 - 50 + 93 ^ 157 + 155 - 168 + 34;
        i.lIlIlIIIlllII[117] = -(0xFFFFE737 & 0x78EB) & (0xFFFFFFF7 & 0x7FFB);
        i.lIlIlIIIlllII[118] = 0x71 ^ 0x4F;
        i.lIlIlIIIlllII[119] = 0xFFFFA3D7 & 0x7FFB;
        i.lIlIlIIIlllII[120] = 0x96 ^ 0xA0 ^ (0x42 ^ 0x4B);
        i.lIlIlIIIlllII[121] = -(0xFFFFDF7D & 0x69C7) & (0xFFFFCFFF & 0x7DF7);
        i.lIlIlIIIlllII[122] = 0x4A ^ 0xA;
        i.lIlIlIIIlllII[123] = 0xFFFF9DCB & 0x7FF6;
        i.lIlIlIIIlllII[124] = 0x26 ^ 0x67;
        i.lIlIlIIIlllII[125] = -(0xFFFFEEF7 & 0x734E) & (0xFFFFEBEF & 0x77FF);
        i.lIlIlIIIlllII[126] = 78 + 151 - 114 + 92 ^ 34 + 118 - 97 + 86;
        i.lIlIlIIIlllII[127] = 0xFFFFA3A5 & 0x5FFB;
        i.lIlIlIIIlllII[128] = 0x17 ^ 0x12 ^ (0xD ^ 0x4B);
        i.lIlIlIIIlllII[129] = -(0xFFFF8ADF & 0x7FAE) & (0xFFFFBFFF & 0x4EBF);
        i.lIlIlIIIlllII[130] = 0x65 ^ 0x2C ^ (0x6A ^ 0x67);
        i.lIlIlIIIlllII[131] = 0xFFFFDEB7 & 0x31CE;
        i.lIlIlIIIlllII[132] = 0xE ^ 0x22 ^ (0xF8 ^ 0x91);
        i.lIlIlIIIlllII[133] = 0xFFFFF3C7 & 0x1FFD;
        i.lIlIlIIIlllII[134] = 0xF8 ^ 0xBE;
        i.lIlIlIIIlllII[135] = 0xFFFF99FF & 0x7FC8;
        i.lIlIlIIIlllII[136] = 0x76 ^ 0x31;
        i.lIlIlIIIlllII[137] = 0xFFFF9D33 & 0x7EFE;
        i.lIlIlIIIlllII[138] = 160 + 66 - 106 + 79 ^ 134 + 110 - 181 + 80;
        i.lIlIlIIIlllII[139] = 0xFFFFBFF3 & 0x5D6D;
        i.lIlIlIIIlllII[140] = 57 + 29 - 69 + 181 ^ 96 + 8 - -27 + 12;
        i.lIlIlIIIlllII[141] = 0xFFFFFDDE & 0x1FA1;
        i.lIlIlIIIlllII[142] = 0x61 ^ 0x2B;
        i.lIlIlIIIlllII[143] = 0xFFFFDD83 & 0x3FFF;
        i.lIlIlIIIlllII[144] = 0x88 ^ 0xC3;
        i.lIlIlIIIlllII[145] = 0xFFFFDDDB & 0x3FE5;
        i.lIlIlIIIlllII[146] = 0x35 ^ 0x59 ^ (0x81 ^ 0xA1);
        i.lIlIlIIIlllII[147] = -(0xFFFFF1FE & 0x1FB7) & (0xFFFFF7B7 & 0x39FF);
        i.lIlIlIIIlllII[148] = 47 + 76 - 13 + 104 ^ 120 + 103 - 111 + 43;
        i.lIlIlIIIlllII[149] = 0xFFFFFC7B & 0x2387;
        i.lIlIlIIIlllII[150] = 0x41 ^ 0xF;
        i.lIlIlIIIlllII[151] = -(0xFFFFEFED & 0x5F93) & (0xFFFFEFF5 & 0x7FEE);
        i.lIlIlIIIlllII[152] = 0x36 ^ 0x79;
        i.lIlIlIIIlllII[153] = -(0xFFFFDC9C & 0x7F6F) & (0xFFFFFFDB & Short.MAX_VALUE);
        i.lIlIlIIIlllII[154] = 130 + 59 - 182 + 142 ^ 96 + 141 - 123 + 83;
        i.lIlIlIIIlllII[155] = 0xFFFFFFFF & 0x23CE;
        i.lIlIlIIIlllII[156] = 89 + 89 - 78 + 124 ^ 110 + 22 - 126 + 171;
        i.lIlIlIIIlllII[157] = 0xFFFFEAE6 & 0x17DF;
        i.lIlIlIIIlllII[158] = 40 + 40 - -76 + 87 ^ 114 + 142 - 120 + 25;
        i.lIlIlIIIlllII[159] = -(0xFFFFBFFF & 0x7C01) & (0xFFFFFFD7 & 0x3EEF);
        i.lIlIlIIIlllII[160] = 0xC2 ^ 0x91;
        i.lIlIlIIIlllII[161] = 0xFFFFB5AD & 0x4EDB;
        i.lIlIlIIIlllII[162] = 1 ^ 0x55;
        i.lIlIlIIIlllII[163] = 0xFFFFC5FB & 0x3E8E;
        i.lIlIlIIIlllII[164] = 0x52 ^ 7;
        i.lIlIlIIIlllII[165] = 0xFFFFDDDF & 0x26AF;
        i.lIlIlIIIlllII[166] = 0x75 ^ 0x23;
        i.lIlIlIIIlllII[167] = -(0xFFFFF77D & 0x9D3) & (0xFFFFFFFF & 0x1FFF);
        i.lIlIlIIIlllII[168] = 0xB1 ^ 0xB7 ^ (0x10 ^ 0x41);
        i.lIlIlIIIlllII[169] = -(0xFFFFF8C5 & 0x6F3F) & (0xFFFFEFBF & 0x7FFE);
        i.lIlIlIIIlllII[170] = 0xF1 ^ 0xA9;
        i.lIlIlIIIlllII[171] = 0xFFFFD7BB & 0x2FFF;
        i.lIlIlIIIlllII[172] = 0xA2 ^ 0x96 ^ (0x37 ^ 0x5A);
        i.lIlIlIIIlllII[173] = 0xFFFFB774 & 0x69DF;
        i.lIlIlIIIlllII[174] = 0x34 ^ 0x6E;
        i.lIlIlIIIlllII[175] = 0xFFFFBDB7 & 0x675D;
        i.lIlIlIIIlllII[176] = 89 + 6 - -55 + 2 ^ 80 + 126 - 71 + 60;
    }

    public String toString() {
        CharSequence[] charSequenceArray = super.toString().toLowerCase().split(lIlIlIIIlIlII[lIlIlIIIlllII[3]]);
        Arrays.stream(charSequenceArray).collect(Collectors.toList()).toArray(charSequenceArray);
        0;
        return String.join((CharSequence)lIlIlIIIlIlII[lIlIlIIIlllII[4]], charSequenceArray);
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean lIllllIllIIllll(Object object, Object object2) {
        return object != object2;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private static String lIllllIlIllIIll(String var17, String var19) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlllII[11]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIlIIIlllII[2], var1);
            return new String(var6.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private i(int n3, j j2, boolean bl) {
        if (i.lIllllIllIIlllI((Object)j2)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[1]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = bl;
        this.baseSpellDamage = lIlIlIIIlllII[0];
    }

    public static boolean b(i i2) {
        boolean bl;
        if (!i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF) || !i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST) || !i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_WAVE_STAFF) || i.lIllllIllIlIIII((Object)i2, (Object)MAGIC_STANDARD_SURGE_STAFF)) {
            bl = lIlIlIIIlllII[1];
            0;
            if (((0xB8 ^ 0xBC) & ~(0x80 ^ 0x84)) < 0) {
                return false;
            }
        } else {
            bl = lIlIlIIIlllII[0];
        }
        return bl;
    }

    private static void lIllllIllIIllII() {
        lIlIlIIIlIlII = new String[lIlIlIIIlllII[176]];
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[0]] = i."Attack Style must be valid for AnimationData";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[1]] = i."Attack Style must be valid for AnimationData";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[2]] = i."Attack Style and Attack Type must be valid for AnimationData";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[3]] = i."_";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[4]] = i." ";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[5]] = i."MELEE_VIGGORAS_CHAINMACE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[7]] = i."MELEE_DAGGER_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[9]] = i."MELEE_SPEAR_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[11]] = i."MELEE_SWORD_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[13]] = i."MELEE_SCIM_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[15]] = i."MELEE_LANCE_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[17]] = i."MELEE_LANCE_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[19]] = i."MELEE_LANCE_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[21]] = i."MELEE_FANG_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[23]] = i."MELEE_FANG_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[25]] = i."MELEE_GENERIC_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[27]] = i."MELEE_STAFF_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[28]] = i."MELEE_BATTLEAXE_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[30]] = i."MELEE_MACE_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[32]] = i."MELEE_BATTLEAXE_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[34]] = i."MELEE_2H_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[36]] = i."MELEE_2H_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[38]] = i."MELEE_STAFF_CRUSH_2";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[40]] = i."MELEE_STAFF_CRUSH_3";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[42]] = i."MELEE_PUNCH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[44]] = i."MELEE_KICK";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[46]] = i."MELEE_STAFF_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[48]] = i."MELEE_SPEAR_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[50]] = i."MELEE_STAFF_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[52]] = i."MELEE_DLONG_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[54]] = i."MELEE_DRAGON_MACE_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[56]] = i."MELEE_DRAGON_DAGGER_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[58]] = i."MELEE_DRAGON_WARHAMMER_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[60]] = i."MELEE_ABYSSAL_WHIP";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[62]] = i."MELEE_GRANITE_MAUL";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[64]] = i."MELEE_GRANITE_MAUL_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[66]] = i."MELEE_DHAROKS_GREATAXE_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[68]] = i."MELEE_DHAROKS_GREATAXE_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[70]] = i."MELEE_AHRIMS_STAFF_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[72]] = i."MELEE_OBBY_MAUL_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[74]] = i."MELEE_ABYSSAL_DAGGER_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[76]] = i."MELEE_ABYSSAL_BLUDGEON_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[78]] = i."MELEE_LEAF_BLADED_BATTLEAXE_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[80]] = i."MELEE_INQUISITORS_MACE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[82]] = i."MELEE_BARRELCHEST_ANCHOR_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[84]] = i."MELEE_LEAF_BLADED_BATTLEAXE_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[86]] = i."MELEE_GODSWORD_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[88]] = i."MELEE_GODSWORD_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[90]] = i."MELEE_GODSWORD_DEFENSIVE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[92]] = i."MELEE_DRAGON_CLAWS_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[94]] = i."MELEE_VLS_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[96]] = i."MELEE_ELDER_MAUL";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[98]] = i."MELEE_ZAMORAK_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[100]] = i."MELEE_ZAMORAK_GODSWORD_OR_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[102]] = i."MELEE_SARADOMIN_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[104]] = i."MELEE_SARADOMIN_GODSWORD_OR_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[106]] = i."MELEE_BANDOS_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[108]] = i."MELEE_BANDOS_GODSWORD_OR_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[110]] = i."MELEE_ARMADYL_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[112]] = i."MELEE_ARMADYL_GODSWORD_OR_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[114]] = i."MELEE_SCYTHE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[116]] = i."MELEE_GHAZI_RAPIER_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[118]] = i."MELEE_ANCIENT_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[120]] = i."MELEE_CRYSTAL_HALBERD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[122]] = i."RANGED_CHINCHOMPA";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[124]] = i."RANGED_SHORTBOW";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[126]] = i."RANGED_RUNE_KNIFE_PVP";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[128]] = i."RANGED_MAGIC_SHORTBOW_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[130]] = i."RANGED_CROSSBOW_PVP";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[132]] = i."RANGED_BLOWPIPE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[134]] = i."RANGED_DARTS";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[136]] = i."RANGED_BALLISTA";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[138]] = i."RANGED_DRAGON_THROWNAXE_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[140]] = i."RANGED_RUNE_CROSSBOW";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[142]] = i."RANGED_BALLISTA_2";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[144]] = i."RANGED_RUNE_KNIFE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[146]] = i."RANGED_DRAGON_KNIFE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[148]] = i."RANGED_DRAGON_KNIFE_POISONED";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[150]] = i."RANGED_DRAGON_KNIFE_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[152]] = i."RANGED_ZARYTE_CROSSBOW";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[154]] = i."RANGED_ZARYTE_CROSSBOW_PVP";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[156]] = i."MAGIC_STANDARD_BIND";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[158]] = i."MAGIC_STANDARD_STRIKE_BOLT_BLAST";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[160]] = i."MAGIC_STANDARD_BIND_STAFF";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[162]] = i."MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[164]] = i."MAGIC_STANDARD_WAVE_STAFF";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[166]] = i."MAGIC_STANDARD_SURGE_STAFF";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[168]] = i."MAGIC_ANCIENT_SINGLE_TARGET";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[170]] = i."MAGIC_ANCIENT_MULTI_TARGET";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[172]] = i."MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[174]] = i."MAGIC_TUMEKENS_SHADOW";
    }

    private static boolean lIllllIllIlIIII(Object object, Object object2) {
        return object == object2;
    }

    private i(int n3, j j2, int n4) {
        if (i.lIllllIllIIlllI((Object)j2)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[2]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = lIlIlIIIlllII[0];
        this.baseSpellDamage = n4;
    }

    public static i d(int n2) {
        return DATA.get(n2);
    }

    public static boolean a(i i2) {
        int n2;
        if (!i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF) || !i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_WAVE_STAFF) || i.lIllllIllIlIIII((Object)i2, (Object)MAGIC_STANDARD_SURGE_STAFF)) {
            n2 = lIlIlIIIlllII[1];
            0;
            
            }
        } else {
            n2 = lIlIlIIIlllII[0];
        }
        return n2 != 0;
    }

    private static String lIllllIlIllIlIl(String var18, String var8) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIlIlIIIlllII[2], var2);
            return new String(var20.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIllIlIIlI(int n2) {
        return n2 <= 0;
    }

    private i(int n3, j j2) {
        if (i.lIllllIllIIlllI((Object)j2)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[0]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = lIlIlIIIlllII[0];
        this.baseSpellDamage = lIlIlIIIlllII[0];
    }
}

