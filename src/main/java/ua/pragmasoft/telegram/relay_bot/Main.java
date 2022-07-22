package ua.pragmasoft.telegram.relay_bot;

import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Option;

/**
 * Main class.
 */
public final class Main implements Callable<Integer> {

  /**
   * Logger.
   */
  static final Logger LOG = LoggerFactory.getLogger(Main.class);

  Main() {

  }

  @Option(names = {"-a", "--api-id"}, required = true,
      description = "Telegram tdlib api_id, can be obtained at https://my.telegram.org/")
  String apiId;

  @Option(names = {"-h", "--api-hash"}, required = true,
      description = "Telegram tdlib api_hash, can be obtained at https://my.telegram.org/")
  //
  String apiHash;

  @Option(names = {"-n", "--bot-name"},
      description = "Telegram bot name, should be registered in @BotFather https://t.me/BotFather")
  String botName = "pragmasoft_relay_bot";

  @Option(names = {"-t", "--bot-token"}, required = true,
      description = "Telegram bot token, @BotFather https://t.me/BotFather returns it after registration")
  String botToken;

  /**
   * Entry point.
   *
   * @param args arguments
   */
  public static void main(final String[] args) {
    int exitCode = new CommandLine(new Main()).execute(args);
    System.exit(exitCode);
  }

  @Override
  public Integer call() throws Exception {
    LOG.info("""

          api_id={}
          api_hash={}
          bot_name={}
          bot_token={}
        """, this.apiId, this.apiHash, this.botName, this.botToken);
    return 0;
  }
}
