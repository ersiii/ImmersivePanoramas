package xyz.ersi.immersivepanoramas.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class ModLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger("ImmersivePanoramas");
    private static final boolean IS_DEV = FabricLoader.getInstance().isDevelopmentEnvironment();

    private ModLogger() {}

    public static boolean isDev() {
        return IS_DEV;
    }

    public static void info(String message) {
        if (IS_DEV) {
            LOGGER.info(message);
        }
    }

    public static void info(String message, Object arg) {
        if (IS_DEV) {
            LOGGER.info(message, arg);
        }
    }

    public static void info(String message, Object arg1, Object arg2) {
        if (IS_DEV) {
            LOGGER.info(message, arg1, arg2);
        }
    }

    public static void info(String message, Object... args) {
        if (IS_DEV) {
            LOGGER.info(message, args);
        }
    }

    public static void warn(String message) {
        if (IS_DEV) {
            LOGGER.warn(message);
        }
    }

    public static void warn(String message, Object arg) {
        if (IS_DEV) {
            LOGGER.warn(message, arg);
        }
    }

    public static void warn(String message, Object arg1, Object arg2) {
        if (IS_DEV) {
            LOGGER.warn(message, arg1, arg2);
        }
    }

    public static void warn(String message, Object... args) {
        if (IS_DEV) {
            LOGGER.warn(message, args);
        }
    }

    public static void error(String message) {
        LOGGER.error(message);
    }

    public static void error(String message, Throwable t) {
        LOGGER.error(message, t);
    }

    public static void error(String message, Object arg) {
        LOGGER.error(message, arg);
    }

    public static void error(String message, Object arg1, Object arg2) {
        LOGGER.error(message, arg1, arg2);
    }

    public static void error(String message, Object... args) {
        LOGGER.error(message, args);
    }
}
