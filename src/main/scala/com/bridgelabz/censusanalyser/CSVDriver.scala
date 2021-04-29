package com.bridgelabz.censusanalyser

object CSVDriver {
  def main(args: Array[String]): Unit = {
    val indianStateCensusDataPath = "asset/IndiaStateCensusData.csv"
    val censusAnalyserObject = new CensusAnalyser()
    censusAnalyserObject.loadCSVData(indianStateCensusDataPath)
  }
}
