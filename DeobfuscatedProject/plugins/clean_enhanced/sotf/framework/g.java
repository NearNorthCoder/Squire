/*
 * Backward compatibility alias for DialogUtil.
 *
 * This class provides the original obfuscated class name 'g' to maintain
 * compatibility with step files that haven't been fully deobfuscated yet.
 *
 * @deprecated Use {@link DialogUtil} directly instead. This class will be
 *             removed once all step files are updated to use proper class names.
 */
package gg.squire.sotf.framework;

/**
 * @deprecated Use {@link DialogUtil} instead
 */
@Deprecated
public final class g {

    /** @deprecated Use {@link DialogUtil#chooseDialogOptions(String[])} */
    @Deprecated
    public static void a(String[] options) {
        DialogUtil.chooseDialogOptions(options);
    }

    /** @deprecated Use {@link DialogUtil#talkToNpc(String, String[])} */
    @Deprecated
    public static void a(String npcName, String[] options) {
        DialogUtil.talkToNpc(npcName, options);
    }

    /** @deprecated Use {@link DialogUtil#talkToNpcWithWalk(String, String[], boolean)} */
    @Deprecated
    public static void a(String npcName, String[] options, boolean walkFirst) {
        DialogUtil.talkToNpcWithWalk(npcName, options, walkFirst);
    }

    /** @deprecated Use {@link DialogUtil#talkToNpcLoop(String, String[])} */
    @Deprecated
    public static void b(String npcName, String[] options) {
        DialogUtil.talkToNpcLoop(npcName, options);
    }

    /** @deprecated Use {@link DialogUtil#isConversationOpen()} */
    @Deprecated
    public static boolean M() {
        return DialogUtil.isConversationOpen();
    }

    private g() {
        throw new UnsupportedOperationException("Utility class");
    }
}
