/*
 * Backward compatibility alias for BankingUtil.
 *
 * This class provides the original obfuscated class name 'a' to maintain
 * compatibility with step files that haven't been fully deobfuscated yet.
 *
 * @deprecated Use {@link BankingUtil} directly instead. This class will be
 *             removed once all step files are updated to use proper class names.
 */
package gg.squire.sotf.framework;

import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/**
 * @deprecated Use {@link BankingUtil} instead
 */
@Deprecated
public final class a {

    /** @deprecated Use {@link BankingUtil#openNearestBank()} */
    @Deprecated
    public static void a() {
        BankingUtil.openNearestBank();
    }

    /** @deprecated Use {@link BankingUtil#navigateToBank(BankLocation)} */
    @Deprecated
    public static void a(BankLocation bankLocation) {
        BankingUtil.navigateToBank(bankLocation);
    }

    /** @deprecated Use {@link BankingUtil#withdrawItem(int, int)} */
    @Deprecated
    public static void a(int itemId, int quantity) {
        BankingUtil.withdrawItem(itemId, quantity);
    }

    /** @deprecated Use {@link BankingUtil#withdrawItems(int[])} */
    @Deprecated
    public static void a(int[] itemIds) {
        BankingUtil.withdrawItems(itemIds);
    }

    /** @deprecated Use {@link BankingUtil#withdrawNoted(int, int)} */
    @Deprecated
    public static void b(int itemId, int quantity) {
        BankingUtil.withdrawNoted(itemId, quantity);
    }

    /** @deprecated Use {@link BankingUtil#withdrawItemsUntilFound(int[], int)} */
    @Deprecated
    public static void b(int[] itemIds, int quantity) {
        BankingUtil.withdrawItemsUntilFound(itemIds, quantity);
    }

    private a() {
        throw new UnsupportedOperationException("Utility class");
    }
}
