/*
 * Backward compatibility alias for GameStateUtil.
 *
 * This class provides the original obfuscated class name 'e' to maintain
 * compatibility with step files that haven't been fully deobfuscated yet.
 *
 * @deprecated Use {@link GameStateUtil} directly instead. This class will be
 *             removed once all step files are updated to use proper class names.
 */
package gg.squire.sotf.framework;

import net.runelite.api.coords.WorldPoint;
import java.util.HashMap;

/**
 * @deprecated Use {@link GameStateUtil} instead
 */
@Deprecated
public final class e {

    // ==================== VARBIT AND GAME STATE ====================

    /** @deprecated Use {@link GameStateUtil#getVarbit(int)} */
    @Deprecated
    public static int j(int varbitId) {
        return GameStateUtil.getVarbit(varbitId);
    }

    /** @deprecated Use {@link GameStateUtil#isPlayerSkulled()} */
    @Deprecated
    public static boolean s() {
        return GameStateUtil.isPlayerSkulled();
    }

    /** @deprecated Use {@link GameStateUtil#getCombatLevel()} */
    @Deprecated
    public static int J() {
        return GameStateUtil.getCombatLevel();
    }

    // ==================== PLAYER STATUS ====================

    /** @deprecated Use {@link GameStateUtil#getHealthPercentage()} */
    @Deprecated
    public static double w() {
        return GameStateUtil.getHealthPercentage();
    }

    /** @deprecated Use {@link GameStateUtil#isInSafeArea()} */
    @Deprecated
    public static boolean H() {
        return GameStateUtil.isInSafeArea();
    }

    // ==================== RANDOM AND TIMING ====================

    /** @deprecated Use {@link GameStateUtil#randomRange(int, int)} */
    @Deprecated
    public static int c(int min, int max) {
        return GameStateUtil.randomRange(min, max);
    }

    /** @deprecated Use {@link GameStateUtil#getRuntime()} */
    @Deprecated
    public static long u() {
        return GameStateUtil.getRuntime();
    }

    /** @deprecated Use {@link GameStateUtil#getElapsedTime(long)} */
    @Deprecated
    public static long a(long startTime) {
        return GameStateUtil.getElapsedTime(startTime);
    }

    // ==================== FORMATTING ====================

    /** @deprecated Use {@link GameStateUtil#formatNumber(int)} */
    @Deprecated
    public static String h(int number) {
        return GameStateUtil.formatNumber(number);
    }

    /** @deprecated Use {@link GameStateUtil#formatTime(long)} */
    @Deprecated
    public static String b(long millis) {
        return GameStateUtil.formatTime(millis);
    }

    // ==================== COMBAT SETTINGS ====================

    /** @deprecated Use {@link GameStateUtil#enableAutoRetaliate()} */
    @Deprecated
    public static void E() {
        GameStateUtil.enableAutoRetaliate();
    }

    /** @deprecated Use {@link GameStateUtil#disableAutoRetaliate()} */
    @Deprecated
    public static void F() {
        GameStateUtil.disableAutoRetaliate();
    }

    // ==================== GRAND EXCHANGE WARNINGS ====================

    /** @deprecated Use {@link GameStateUtil#isGrandExchangeWarningEnabled()} */
    @Deprecated
    public static boolean z() {
        return GameStateUtil.isGrandExchangeWarningEnabled();
    }

    /** @deprecated Use {@link GameStateUtil#isSettingsWindowOpen()} */
    @Deprecated
    public static boolean B() {
        return GameStateUtil.isSettingsWindowOpen();
    }

    /** @deprecated Use {@link GameStateUtil#openAllSettings()} */
    @Deprecated
    public static void C() {
        GameStateUtil.openAllSettings();
    }

    /** @deprecated Use {@link GameStateUtil#disableGrandExchangeWarning()} */
    @Deprecated
    public static void A() {
        GameStateUtil.disableGrandExchangeWarning();
    }

    // ==================== WORLD HOPPING ====================

    /** @deprecated Use {@link GameStateUtil#hopToRandomWorld()} */
    @Deprecated
    public static void D() {
        GameStateUtil.hopToRandomWorld();
    }

    /** @deprecated Use {@link GameStateUtil#hopToWorld(int)} */
    @Deprecated
    public static void k(int worldId) {
        GameStateUtil.hopToWorld(worldId);
    }

    /** @deprecated Use {@link GameStateUtil#getRandomWorldFromList()} */
    @Deprecated
    public static int v() {
        return GameStateUtil.getRandomWorldFromList();
    }

    /** @deprecated Use {@link GameStateUtil#closeBankAndHopWorld()} */
    @Deprecated
    public static void x() {
        GameStateUtil.closeBankAndHopWorld();
    }

    // ==================== INVENTORY AND EQUIPMENT ====================

    /** @deprecated Use {@link GameStateUtil#bankContainsItem(int)} */
    @Deprecated
    public static boolean i(int itemId) {
        return GameStateUtil.bankContainsItem(itemId);
    }

    /** @deprecated Use {@link GameStateUtil#hasAllItemsInBank(int[])} */
    @Deprecated
    public static boolean c(int[] itemIds) {
        return GameStateUtil.hasAllItemsInBank(itemIds);
    }

    /** @deprecated Use {@link GameStateUtil#equipItem(int)} */
    @Deprecated
    public static void l(int itemId) {
        GameStateUtil.equipItem(itemId);
    }

    /** @deprecated Use {@link GameStateUtil#equipItems(int[])} */
    @Deprecated
    public static void b(int[] itemIds) {
        GameStateUtil.equipItems(itemIds);
    }

    // ==================== DIALOG AND UI ====================

    /** @deprecated Use {@link GameStateUtil#handleConversationContinue()} */
    @Deprecated
    public static void t() {
        GameStateUtil.handleConversationContinue();
    }

    /** @deprecated Use {@link GameStateUtil#closeEnterAmountWidget()} */
    @Deprecated
    public static void y() {
        GameStateUtil.closeEnterAmountWidget();
    }

    /** @deprecated Use {@link GameStateUtil#clickInterfaceButton()} */
    @Deprecated
    public static void I() {
        GameStateUtil.clickInterfaceButton();
    }

    // ==================== DEATH HANDLING ====================

    /** @deprecated Use {@link GameStateUtil#handleDeath()} */
    @Deprecated
    public static void G() {
        GameStateUtil.handleDeath();
    }

    // ==================== BANKING ====================

    /** @deprecated Use {@link GameStateUtil#handleBanking(HashMap, boolean, boolean)} */
    @Deprecated
    public static void a(HashMap<Integer, Integer> items,
                         boolean depositInventory,
                         boolean depositEquipment) {
        GameStateUtil.handleBanking(items, depositInventory, depositEquipment);
    }

    // ==================== NAVIGATION ====================

    /** @deprecated Use {@link GameStateUtil#clickTile(WorldPoint)} */
    @Deprecated
    public static void c(WorldPoint tile) {
        GameStateUtil.clickTile(tile);
    }

    // ==================== FILE AND NETWORK ====================

    /** @deprecated Use {@link GameStateUtil#sendWebhook(String, String)} */
    @Deprecated
    public static void a(String webhookUrl, String message) {
        GameStateUtil.sendWebhook(webhookUrl, message);
    }

    private e() {
        throw new UnsupportedOperationException("Utility class");
    }
}
