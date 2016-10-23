/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

package io.github.vocabhunter.osx.distribution;

import io.github.vocabhunter.gui.main.CoreGuiModule;
import io.github.vocabhunter.gui.main.LiveGuiModule;
import io.github.vocabhunter.gui.main.VocabHunterGuiExecutable;
import io.github.vocabhunter.osx.OsxEventSourceModule;

public class OsxPackagedVocabHunter extends VocabHunterGuiExecutable {
    public static void main(final String... args) {
        runApp(args, a -> launch(a), new CoreGuiModule(), new LiveGuiModule(), new OsxEventSourceModule(args));
    }
}
