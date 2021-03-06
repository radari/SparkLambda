package config

import com.typesafe.config.ConfigFactory

/**
  * Created by Pramod on 5/23/2017.
  */
object Settings {
  private val config = ConfigFactory.load()

  object WebLogGen{
    private val weblogGen = config.getConfig("clickstream")

    lazy val records = weblogGen.getInt("records")
    lazy val timeMultiplier = weblogGen.getInt("time_multiplier")
    lazy val pages = weblogGen.getInt("pages")
    lazy val visitors = weblogGen.getInt("visitors")
    lazy val filePath = weblogGen.getString("file_path")
    lazy val destinationPath = weblogGen.getString("destination_path")
    lazy val numFiles = weblogGen.getInt("number_of_files")
    lazy val kafkaTopic = weblogGen.getString("kafka_topic")
  }


}
