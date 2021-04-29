package com.bridgelabz.censiusanalysertest

import com.bridgelabz.censusanalyser.CensusAnalyser
import org.scalatest.FunSuite

class CensusAnalyserTest extends FunSuite{
//  test("givenSampleTestCheckingTheTests") {
//    val censusAnalyser = new CensusAnalyser()
//    var x = censusAnalyser.add(10, 20)
//    assert(x == 30)
//  }

  val indiaStateCensusDataPath = "asset/IndiaStateCensusData.csv"
  val wrongFilePathForIndiaStateCensusData = "./IndiaStateCensusData.csv"
  val CensusAnalyzerObj = new CensusAnalyser()

  test("givenIndianCensusCSVFileShouldReturnCorrectNumberOfRecords") {
    assert(CensusAnalyzerObj.loadCSVData(indiaStateCensusDataPath) === 29)
  }
}
