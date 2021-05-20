package com.bridgelabz.censusanalyser

object CSVDriver {
  def main(args: Array[String]): Unit = {
    val indianStateCensusDataPath = "asset/IndiaStateCensusData.csv"
    val indiaStateCodePath = "asset/IndiaStateCode.csv"
    val censusAnalyserObject = new CensusAnalyser()
    censusAnalyserObject.loadIndiaStateCensusData(indianStateCensusDataPath)
    censusAnalyserObject.loadIndiaStateCodeData(indiaStateCodePath)
  }
}
