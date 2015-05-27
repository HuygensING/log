package nl.knaw.huygens;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class Log {
  public static void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
    getLogger().debug(arg0, arg1, arg2, arg3);
  }

  public static void debug(Marker arg0, String arg1, Object... arg2) {
    getLogger().debug(arg0, arg1, arg2);
  }

  public static void debug(Marker arg0, String arg1, Object arg2) {
    getLogger().debug(arg0, arg1, arg2);
  }

  public static void debug(Marker arg0, String arg1, Throwable arg2) {
    getLogger().debug(arg0, arg1, arg2);
  }

  public static void debug(Marker arg0, String arg1) {
    getLogger().debug(arg0, arg1);
  }

  public static void debug(String arg0, Object arg1, Object arg2) {
    getLogger().debug(arg0, arg1, arg2);
  }

  public static void debug(String arg0, Object... arg1) {
    getLogger().debug(arg0, arg1);
  }

  public static void debug(String arg0, Object arg1) {
    getLogger().debug(arg0, arg1);
  }

  public static void debug(String arg0, Throwable arg1) {
    getLogger().debug(arg0, arg1);
  }

  public static void debug(String arg0) {
    getLogger().debug(arg0);
  }

  public static void error(Marker arg0, String arg1, Object arg2, Object arg3) {
    getLogger().error(arg0, arg1, arg2, arg3);
  }

  public static void error(Marker arg0, String arg1, Object... arg2) {
    getLogger().error(arg0, arg1, arg2);
  }

  public static void error(Marker arg0, String arg1, Object arg2) {
    getLogger().error(arg0, arg1, arg2);
  }

  public static void error(Marker arg0, String arg1, Throwable arg2) {
    getLogger().error(arg0, arg1, arg2);
  }

  public static void error(Marker arg0, String arg1) {
    getLogger().error(arg0, arg1);
  }

  public static void error(String arg0, Object arg1, Object arg2) {
    getLogger().error(arg0, arg1, arg2);
  }

  public static void error(String arg0, Object... arg1) {
    getLogger().error(arg0, arg1);
  }

  public static void error(String arg0, Object arg1) {
    getLogger().error(arg0, arg1);
  }

  public static void error(String arg0, Throwable arg1) {
    getLogger().error(arg0, arg1);
  }

  public static void error(String arg0) {
    getLogger().error(arg0);
  }

  public String getName() {
    return getLogger().getName();
  }

  public static void info(Marker arg0, String arg1, Object arg2, Object arg3) {
    getLogger().info(arg0, arg1, arg2, arg3);
  }

  public static void info(Marker arg0, String arg1, Object... arg2) {
    getLogger().info(arg0, arg1, arg2);
  }

  public static void info(Marker arg0, String arg1, Object arg2) {
    getLogger().info(arg0, arg1, arg2);
  }

  public static void info(Marker arg0, String arg1, Throwable arg2) {
    getLogger().info(arg0, arg1, arg2);
  }

  public static void info(Marker arg0, String arg1) {
    getLogger().info(arg0, arg1);
  }

  public static void info(String arg0, Object arg1, Object arg2) {
    getLogger().info(arg0, arg1, arg2);
  }

  public static void info(String arg0, Object... arg1) {
    getLogger().info(arg0, arg1);
  }

  public static void info(String arg0, Object arg1) {
    getLogger().info(arg0, arg1);
  }

  public static void info(String arg0, Throwable arg1) {
    getLogger().info(arg0, arg1);
  }

  public static void info(String arg0) {
    getLogger().info(arg0);
  }

  public boolean isDebugEnabled() {
    return getLogger().isDebugEnabled();
  }

  public boolean isDebugEnabled(Marker arg0) {
    return getLogger().isDebugEnabled(arg0);
  }

  public boolean isErrorEnabled() {
    return getLogger().isErrorEnabled();
  }

  public boolean isErrorEnabled(Marker arg0) {
    return getLogger().isErrorEnabled(arg0);
  }

  public boolean isInfoEnabled() {
    return getLogger().isInfoEnabled();
  }

  public boolean isInfoEnabled(Marker arg0) {
    return getLogger().isInfoEnabled(arg0);
  }

  public boolean isTraceEnabled() {
    return getLogger().isTraceEnabled();
  }

  public boolean isTraceEnabled(Marker arg0) {
    return getLogger().isTraceEnabled(arg0);
  }

  public boolean isWarnEnabled() {
    return getLogger().isWarnEnabled();
  }

  public boolean isWarnEnabled(Marker arg0) {
    return getLogger().isWarnEnabled(arg0);
  }

  public static void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
    getLogger().trace(arg0, arg1, arg2, arg3);
  }

  public static void trace(Marker arg0, String arg1, Object... arg2) {
    getLogger().trace(arg0, arg1, arg2);
  }

  public static void trace(Marker arg0, String arg1, Object arg2) {
    getLogger().trace(arg0, arg1, arg2);
  }

  public static void trace(Marker arg0, String arg1, Throwable arg2) {
    getLogger().trace(arg0, arg1, arg2);
  }

  public static void trace(Marker arg0, String arg1) {
    getLogger().trace(arg0, arg1);
  }

  public static void trace(String arg0, Object arg1, Object arg2) {
    getLogger().trace(arg0, arg1, arg2);
  }

  public static void trace(String arg0, Object... arg1) {
    getLogger().trace(arg0, arg1);
  }

  public static void trace(String arg0, Object arg1) {
    getLogger().trace(arg0, arg1);
  }

  public static void trace(String arg0, Throwable arg1) {
    getLogger().trace(arg0, arg1);
  }

  public static void trace(String arg0) {
    getLogger().trace(arg0);
  }

  public static void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
    getLogger().warn(arg0, arg1, arg2, arg3);
  }

  public static void warn(Marker arg0, String arg1, Object... arg2) {
    getLogger().warn(arg0, arg1, arg2);
  }

  public static void warn(Marker arg0, String arg1, Object arg2) {
    getLogger().warn(arg0, arg1, arg2);
  }

  public static void warn(Marker arg0, String arg1, Throwable arg2) {
    getLogger().warn(arg0, arg1, arg2);
  }

  public static void warn(Marker arg0, String arg1) {
    getLogger().warn(arg0, arg1);
  }

  public static void warn(String arg0, Object arg1, Object arg2) {
    getLogger().warn(arg0, arg1, arg2);
  }

  public static void warn(String arg0, Object... arg1) {
    getLogger().warn(arg0, arg1);
  }

  public static void warn(String arg0, Object arg1) {
    getLogger().warn(arg0, arg1);
  }

  public static void warn(String arg0, Throwable arg1) {
    getLogger().warn(arg0, arg1);
  }

  public static void warn(String arg0) {
    getLogger().warn(arg0);
  }

  static String getCallingClassName() {
    return Thread.currentThread().getStackTrace()[4].getClassName();
  }

  static Logger getLogger() {
    return LoggerFactory.getLogger(getCallingClassName());
  }

}

