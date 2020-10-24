package io.anemortalkid.sample;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.reporting.AbstractMavenReport;
import org.apache.maven.reporting.MavenReportException;

import java.util.Locale;

@Mojo(name = "word", defaultPhase = LifecyclePhase.SITE, threadSafe = true)
public class SampleReport extends AbstractMavenReport {

  @Parameter private String word;

  protected void executeReport(Locale locale) throws MavenReportException {
    getLog().info("Word is " + word);
  }

  public String getOutputName() {
    return "word.html";
  }

  public String getName(Locale locale) {
    return "word";
  }

  public String getDescription(Locale locale) {
    return "Prints a word from config";
  }
}
