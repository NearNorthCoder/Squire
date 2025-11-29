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
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.j;

public final class i
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
            void llllllllllllllIllIllIIIIlIIlIlIl;
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
            int llllllllllllllIllIllIIIIlIIlIlII = lIlIlIIIlllII[0];
            while (i.lIllllIllIlIIIl(llllllllllllllIllIllIIIIlIIlIlII, (int)llllllllllllllIllIllIIIIlIIlIlIl)) {
                void llllllllllllllIllIllIIIIlIIlIllI;
                void llllllllllllllIllIllIIIIlIIlIIll = llllllllllllllIllIllIIIIlIIlIllI[llllllllllllllIllIllIIIIlIIlIlII];
                if (i.lIllllIllIlIIlI(llllllllllllllIllIllIIIIlIIlIIll.animationId)) {
                    "".length();
                    if (null != null) {
                        break block4;
                    }
                } else {
                    void llllllllllllllIllIllIIIIlIIlIlll;
                    llllllllllllllIllIllIIIIlIIlIlll.put((Object)llllllllllllllIllIllIIIIlIIlIIll.animationId, (Object)llllllllllllllIllIllIIIIlIIlIIll);
                    "".length();
                }
                ++llllllllllllllIllIllIIIIlIIlIlII;
                "".length();
                if (null == null) continue;
                break block4;
            }
            DATA = builder.build();
        }
    }

    private static String lIllllIlIllIlII(String llllllllllllllIllIllIIIIlIIIIIll, String llllllllllllllIllIllIIIIlIIIIIlI) {
        llllllllllllllIllIllIIIIlIIIIIll = new String(Base64.getDecoder().decode(llllllllllllllIllIllIIIIlIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIllIIIIlIIIIllI = new StringBuilder();
        char[] llllllllllllllIllIllIIIIlIIIIlIl = llllllllllllllIllIllIIIIlIIIIIlI.toCharArray();
        int llllllllllllllIllIllIIIIlIIIIlII = lIlIlIIIlllII[0];
        char[] llllllllllllllIllIllIIIIIllllllI = llllllllllllllIllIllIIIIlIIIIIll.toCharArray();
        int llllllllllllllIllIllIIIIIlllllIl = llllllllllllllIllIllIIIIIllllllI.length;
        int llllllllllllllIllIllIIIIIlllllII = lIlIlIIIlllII[0];
        while (i.lIllllIllIlIIIl(llllllllllllllIllIllIIIIIlllllII, llllllllllllllIllIllIIIIIlllllIl)) {
            char llllllllllllllIllIllIIIIlIIIlIIl = llllllllllllllIllIllIIIIIllllllI[llllllllllllllIllIllIIIIIlllllII];
            llllllllllllllIllIllIIIIlIIIIllI.append((char)(llllllllllllllIllIllIIIIlIIIlIIl ^ llllllllllllllIllIllIIIIlIIIIlIl[llllllllllllllIllIllIIIIlIIIIlII % llllllllllllllIllIllIIIIlIIIIlIl.length]));
            "".length();
            ++llllllllllllllIllIllIIIIlIIIIlII;
            ++llllllllllllllIllIllIIIIIlllllII;
            "".length();
            if ((0x65 ^ 0x61) <= (0xA8 ^ 0xAC)) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIllIIIIlIIIIllI);
    }

    private static boolean lIllllIllIIlllI(Object object) {
        return object == null;
    }

    private static void lIllllIllIIllIl() {
        lIlIlIIIlllII = new int[177];
        i.lIlIlIIIlllII[0] = (0xC9 ^ 0xC3) & ~(0x89 ^ 0x83);
        i.lIlIlIIIlllII[1] = " ".length();
        i.lIlIlIIIlllII[2] = "  ".length();
        i.lIlIlIIIlllII[3] = "   ".length();
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
        i.lIlIlIIIlllII[17] = 0x99 ^ 0x90 ^ "  ".length();
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
        "".length();
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

    private static String lIllllIlIllIIll(String llllllllllllllIllIllIIIIIllIIlII, String llllllllllllllIllIllIIIIIllIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlllII[11]), "DES");
            Cipher llllllllllllllIllIllIIIIIllIlIII = Cipher.getInstance("DES");
            llllllllllllllIllIllIIIIIllIlIII.init(lIlIlIIIlllII[2], llllllllllllllIllIllIIIIIllIlIIl);
            return new String(llllllllllllllIllIllIIIIIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIIIllIIlll) {
            llllllllllllllIllIllIIIIIllIIlll.printStackTrace();
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
            "".length();
            if (((0xB8 ^ 0xBC) & ~(0x80 ^ 0x84)) < 0) {
                return ((0x94 ^ 0xBF) & ~(0x35 ^ 0x1E)) != 0;
            }
        } else {
            bl = lIlIlIIIlllII[0];
        }
        return bl;
    }

    private static void lIllllIllIIllII() {
        lIlIlIIIlIlII = new String[lIlIlIIIlllII[176]];
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[0]] = i.lIllllIlIllIIll("UqGRYo9bs/T9FhScZmwN89+Fe/km6br8qnaFDw8ieWN+Q6DjfmXAzINMJs4OOgJ7", "eMkFC");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[1]] = i.lIllllIlIllIlII("FDYGNgk+YiEjEzknUjofJjZSNQ91NBM7AzFiFDgYdQMcPgc0Nhs4BBEjBjY=", "UBrWj");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[2]] = i.lIllllIlIllIIll("Nu4etTyIHDsV3PrZ397rKW5cse/jwLamCFABckuyTuTDKScBqdxQOaYwfKDXL0Apx+hFH325p76ocQiv9BOVNg==", "Wtxsj");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[3]] = i.lIllllIlIllIIll("FjGPnyt9FTk=", "OksXp");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[4]] = i.lIllllIlIllIlIl("MFD/z6jQrIo=", "ZgTvc");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[5]] = i.lIllllIlIllIIll("S90SUXnA+yee6DBgQJYS2O7UOJc+92yjY42moMMvnNA=", "MAPTb");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[7]] = i.lIllllIlIllIlIl("wuf6reFRqI1IcTrNJ+5hF8/VSFiHykrP", "QmIqZ");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[9]] = i.lIllllIlIllIlII("CC8lPCkaOTk8LRc1Oi0tBw==", "Ejiyl");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[11]] = i.lIllllIlIllIIll("hMIg1W0QOmHIUOKW/+Jiv7h9wEE/Rn4o", "nrbbj");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[13]] = i.lIllllIlIllIIll("Q13lxK/KMJR7nMR8HY+cPCdnp2wrMp90", "OgxyA");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[15]] = i.lIllllIlIllIlII("IT0lKw8zNCggCSknOjoLLg==", "lxinJ");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[17]] = i.lIllllIlIllIlII("IisPAw4wIgIICCoxABQePCY=", "onCFK");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[19]] = i.lIllllIlIllIlII("JhIeDzY0GxMEMC4IAQYyOB8=", "kWRJs");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[21]] = i.lIllllIlIllIIll("odjWV/q8HKhNBldWMa0Idg==", "QWWaY");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[23]] = i.lIllllIlIllIIll("Y7H57G3iRm91wqsqJcWKZQ==", "zeqHq");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[25]] = i.lIllllIlIllIlIl("MpSVKozHZdGGzOWab8yWJa/687SNbYoH", "cQgJd");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[27]] = i.lIllllIlIllIIll("a0LAef/lpj/D3F4nooaqgPyR17wXgoYx", "UFPGh");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[28]] = i.lIllllIlIllIIll("p6JrHeDaxda7PCwa7PaqAhBNlA5UotiB", "IVaiq");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[30]] = i.lIllllIlIllIlIl("514N1WLabS+gejbbCZHijg==", "qWHlc");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[32]] = i.lIllllIlIllIIll("VJqWqp10PIvcXHJG4qP/D3khsMb+hc2J", "CUCNH");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[34]] = i.lIllllIlIllIIll("VntFNP8qLFm9M4+Z2XXryQ==", "Ndrbu");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[36]] = i.lIllllIlIllIlII("FBI8Ai4GZTgYOBUWIw8=", "YWpGk");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[38]] = i.lIllllIlIllIlII("KwMBLhU5FRkqFiAZDjkFNQ4SWQ==", "fFMkP");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[40]] = i.lIllllIlIllIIll("hc2M3/JIXliUsXeFsYcEDf2M8gPWREel", "QRUuF");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[42]] = i.lIllllIlIllIlIl("3NoJDDN66JyWGzkreOyzJw==", "hhMVg");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[44]] = i.lIllllIlIllIIll("DyrJOVzgUgpmudBYutr6dg==", "KOthv");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[46]] = i.lIllllIlIllIlIl("Mz3tFxB92xooq0BRrdMfguZOlDQNHAtn", "Eyvni");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[48]] = i.lIllllIlIllIlII("DjIHCyAcJBsLJBEoCBwwED8=", "CwKNe");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[50]] = i.lIllllIlIllIlII("PiEoCyQsNzAPJzU7NwIgICw=", "sddNa");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[52]] = i.lIllllIlIllIlIl("JLQ4Ly/S0FaKbt46UXZ5rjI4tiatIMTh", "waqap");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[54]] = i.lIllllIlIllIlIl("3ASP3l8TuIblioUS2gskvBC2jIsVYe3m", "sGbWB");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[56]] = i.lIllllIlIllIIll("GstKM+vmzfU3hLzIaeXtVTkIgrG1ppi/nAyS5LUCK68=", "JsPxz");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[58]] = i.lIllllIlIllIlII("CgE7LioYACUqKAgKKDwuFQw2JiICFig4PwIH", "GDwko");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[60]] = i.lIllllIlIllIlIl("T9ODnxx4SFyGYWoXzmT2p/bLNbD9nB9I", "JsNgA");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[62]] = i.lIllllIlIllIIll("W/nq29FtbEtpZ/8rbT+qhjvjhPm0ynI3", "xjGOI");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[64]] = i.lIllllIlIllIIll("J3qeHUkLvEIZRKrEkcW7RTmvpg1MBYCo", "xnaEt");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[66]] = i.lIllllIlIllIlIl("xol80lrl4WnAD/j6yOQISRnFkMwKhhzZ2GBpFwqAEsQ=", "MtEMh");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[68]] = i.lIllllIlIllIlIl("VynvKJjFwPkyiMTZeX/6glkEp29bK6s386EKSwHAwtU=", "aFXdT");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[70]] = i.lIllllIlIllIlII("PQciHxYvAyYIGj0RMQkHMQQoBRAiFz0S", "pBnZS");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[72]] = i.lIllllIlIllIlII("Kys1Fgc5ITsRGzkjOAYOOS0rBhEu", "fnySB");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[74]] = i.lIllllIlIllIIll("/SgDbJWr0XZfVFBp+2W/rQjZfV04yqg+jo2qaZr1EXI=", "IVyHK");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[76]] = i.lIllllIlIllIIll("64vVlTx6R5TcEJ5py7+iOtbvcmQA2+L+TZK6/m9p24A=", "ELHKb");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[78]] = i.lIllllIlIllIlIl("Ytgbccmju2R2CYY8/vzCA+841LqIYQz11aB5EtzvHzl3BgyaVLflrA==", "vFBeF");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[80]] = i.lIllllIlIllIIll("jfGGJjw2lOeNMT9ariJro2hJ6XMwwqWc", "RVhmO");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[82]] = i.lIllllIlIllIlII("FRcjAhIHEC4VBR0eLA8SCwYwBhkbGiAVCBsAOhQf", "XRoGW");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[84]] = i.lIllllIlIllIIll("WbmmivSXK36ux26csAXYnd86AKsZRrqpZtrjSCJBbh4qV6ROVA7YEw==", "zywAM");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[86]] = i.lIllllIlIllIlIl("OYFP+J/RknUgkCSwPB9HZHiASe8dGdh+", "dZOcQ");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[88]] = i.lIllllIlIllIIll("YU3O3cZVXaKTeoPoZcvYZ8G0zL2P5+Ss", "dHYqW");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[90]] = i.lIllllIlIllIlII("Fy4LKxwFLAgqCg0kFSoGHi4BKxcJIhEr", "ZkGnY");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[92]] = i.lIllllIlIllIlII("GzEHJj0JMBkiPxk6FCA0FyMYPCsGMQg=", "VtKcx");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[94]] = i.lIllllIlIllIlIl("7xUDH1RMpFt5tv54J4bYxA==", "MmWxV");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[96]] = i.lIllllIlIllIlII("IjIrJzAwMismMD0oKiMgIw==", "owgbu");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[98]] = i.lIllllIlIllIlII("ICw+IQAyMzMpCj8oOTsCIi0hMwo/LS03FSgq", "mirdE");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[100]] = i.lIllllIlIllIlIl("t+fyR6XNEOPtJg2wi77+XevmKRYTIM9Ub6NSOPEAsEU=", "KCstO");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[102]] = i.lIllllIlIllIlIl("sLzbtGNPToxrijp7jdj3oXHZDwkHmak+nBdlEGPH6z0=", "dhmOg");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[104]] = i.lIllllIlIllIlIl("ClO8x82Tvl/vmiIIBFv6wNyO5lrNXPWYjOBjP/w2exqVRKLiw9IQow==", "ihsmQ");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[106]] = i.lIllllIlIllIlII("PC8cMCMuKBE7Ij45DzIpNTkHOjQ1NQMlIzI=", "qjPuf");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[108]] = i.lIllllIlIllIIll("v0aPOqzjL/FxUpr4JK3QKhnrvlPuGZCbcSmfBbjw3Jw=", "ZsZxn");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[110]] = i.lIllllIlIllIlII("DA85IS8eCycpKwUTOTstDg4mMyUTDio3OgQJ", "AJudj");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[112]] = i.lIllllIlIllIIll("hhr5BkAppe4B44DG4WSi74Ojmvg13pxdZpJfyLUa/I8=", "vqUfF");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[114]] = i.lIllllIlIllIIll("xh3HYLFHdTKNrLA0Nt2mcQ==", "HyIEQ");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[116]] = i.lIllllIlIllIlIl("ag/Y8oghpsULAR9x2E/z1G3Nmw3DYw9n", "wntbt");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[118]] = i.lIllllIlIllIlII("FBwpDicGGCsIKxwXMRQlFh02HC0LHToYMhwa", "YYeKb");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[120]] = i.lIllllIlIllIIll("GHUcU8KuvPed4E+4+6PkeoDpdp6zdc4rlf+B0Z4s4Oo=", "ZfRgU");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[122]] = i.lIllllIlIllIlIl("rjOsf4UlF/ZWpWh6sIsZ2xYe+IwDts6n", "lVGAH");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[124]] = i.lIllllIlIllIlII("OwUULz0tGwkgNzsQGCcv", "iDZhx");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[126]] = i.lIllllIlIllIlIl("ugDJVqdxglEUBqdRtq2z2OgOyZG+PzX9", "kEOXL");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[128]] = i.lIllllIlIllIIll("5Q8wvMlgOPyFJAJwV9bTEouPNeViJMxGR5rY5Zajv7o=", "TremW");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[130]] = i.lIllllIlIllIlIl("hSCjlHWcan98U6B5BLIYyptPnwqnKPtP", "WliAf");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[132]] = i.lIllllIlIllIIll("+ylbJIufhg4yHreKEiwQRw==", "ipMWq");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[134]] = i.lIllllIlIllIlIl("rLC+JTkwy3793jKfZLQesQ==", "uNgxG");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[136]] = i.lIllllIlIllIIll("05lgS68pkJKdFFnX3PJz0A==", "wvXBx");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[138]] = i.lIllllIlIllIIll("neMDJaRmj5DMZRTdu82SqewyL9JdI8zo7d09FBLcTEk=", "TucAF");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[140]] = i.lIllllIlIllIlII("FiAeCyoAPgIZIQE+Ex4gFzISAzg=", "DaPLo");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[142]] = i.lIllllIlIllIIll("YEmVBKHWSduE9NxA73Z094ZRG2+KTDST", "RGspR");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[144]] = i.lIllllIlIllIlII("Jy8PLCMxMRM+KDAxCiUvMys=", "unAkf");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[146]] = i.lIllllIlIllIlIl("uf99zfpuYSf2ftkCFPYl+EmRH3WJQ4+9", "vuKUu");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[148]] = i.lIllllIlIllIlIl("qh8/+Wh0NyaTPLNYvOhqgl2j6Xvq0UDPUH7jYGODsD8=", "TxxGt");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[150]] = i.lIllllIlIllIlII("Ow82EAktETwFDS4BNggHJwc+EhM6Hj0U", "iNxWL");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[152]] = i.lIllllIlIllIIll("3sPIaHvkQpO4MoZIAcic6T6yPVQ6NSJs", "CNQgX");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[154]] = i.lIllllIlIllIlIl("uPkwfn1lMnVibTIs8H4t36iCIRkgCPdHA48YSvDf+JA=", "cEYYa");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[156]] = i.lIllllIlIllIlII("BRMJGxcXARoTGgwTHBYLChsAFg==", "HRNRT");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[158]] = i.lIllllIlIllIlII("CDUhMSwaJzI5IQE1NDwwFiA0MSQAKyQ3IxErJDQuFiA=", "Etfxo");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[160]] = i.lIllllIlIllIlIl("kG9HIhUjSLz+yT2x2xR0Nts099pD+OJrF5cBttLOY9w=", "aaonO");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[162]] = i.lIllllIlIllIlIl("xxhM6lBpzU209O4fqvFbAUP4jqp9FQe96Y0w9gZj0SPRn56ZZTJHhQ==", "VcSAc");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[164]] = i.lIllllIlIllIIll("v7eFl7cdhU4CHMhyzgJBdLHMvSe/CMcMgx5JFKuqLf0=", "SRChg");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[166]] = i.lIllllIlIllIlII("HisQJygMOQMvJRcrBSo0AD8FKS4MOQMvLRU=", "SjWnk");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[168]] = i.lIllllIlIllIIll("3SF8OfddWToxyBZuE9pqz/iEWB1fGc3+aEBacEjTtcc=", "ZioVt");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[170]] = i.lIllllIlIllIIll("TnI3uqmozJg/gFSr43hPtPhhFKnlWqd0iD9NVyYpb74=", "BwuvR");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[172]] = i.lIllllIlIllIlII("Cy8jBiEZOCsDIxInKAo9CCcjBzYLLzYKPRU6JQkkGT00CiE=", "FndOb");
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[174]] = i.lIllllIlIllIlII("OAAhDAYqFTMIAD4EKBYaJgknAQoi", "uAfEE");
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
            "".length();
            if (null != null) {
                return ((0x5E ^ 0x7C) & ~(0x88 ^ 0xAA)) != 0;
            }
        } else {
            n2 = lIlIlIIIlllII[0];
        }
        return n2 != 0;
    }

    private static String lIllllIlIllIlIl(String llllllllllllllIllIllIIIIIlllIIIl, String llllllllllllllIllIllIIIIIlllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIllIIIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIllIIIIIlllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIllIIIIIlllIlIl.init(lIlIlIIIlllII[2], llllllllllllllIllIllIIIIIlllIllI);
            return new String(llllllllllllllIllIllIIIIIlllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIllIIIIIlllIlII) {
            llllllllllllllIllIllIIIIIlllIlII.printStackTrace();
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

