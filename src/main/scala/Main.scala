package pack

import org.apache.spark.sql.SparkSession
import org.apache.log4j.Logger

object Main extends Serializable {

  @transient lazy val logger: Logger = Logger.getLogger(getClass.getName)

  def main(args: Array[String]): Unit = {
    logger.info("Starting Hello Spark")

    val spark = SparkSession
      .builder()
      .appName("Hello Spark")
      .master("local[*]")
      .getOrCreate()

    // WRITE YOUR CODE HERE

    logger.info("Finishing Hello Spark")
    spark.stop()
  }
}
