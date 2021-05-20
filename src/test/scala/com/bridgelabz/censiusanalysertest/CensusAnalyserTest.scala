package com.bridgelabz.censiusanalysertest

import com.bridgelabz.censusanalyser.CensusAnalyser
import com.bridgelabz.censusanalyser.CensusAnalyzerException.Issue
import org.scalatest.FunSuite

class CensusAnalyserTest extends FunSuite{
//  test("givenSampleTestCheckingTheTests") {
//    val censusAnalyser = new CensusAnalyser()
//    var x = censusAnalyser.add(10, 20)
//    assert(x == 30)
//  }

  val indiaStateCensusDataPath = "asset/IndiaStateCensusData.csv"
  val wrongFilePathForIndiaStateCensusData = "./IndiaStateCensusData.csv"
  val wrongTypeOfIndiaStateCensusData = "asset/IndiaStateCensusData.pdf"
  val wrongHeaderIndiaStateCensusPath = "asset/IndiaStateCode.csv"

  val indiaStateCodeDataPath = "asset/IndiaStateCode.csv"
  val wrongIndiaStateCodeFilePath = "./IndiaStateCode.csv"
  val wrongFileTypeIndiaStateCodePath = "asset/IndiaStateCode.pdf"
  val wrongHeaderIndiaStateCodePath = "asset/IndiaStateCodeWrongHeader.csv"
  val CensusAnalyzerObj = new CensusAnalyser()

  test("givenIndianCensusCSVFileShouldReturnCorrectNumberOfRecords") {
    assert(CensusAnalyzerObj.loadIndiaStateCensusData(indiaStateCensusDataPath) === 29)
  }
  test("givenIndianCensusDataCSVFileIfWrongFilePathShouldThrowException") {
    val thrown = intercept[Exception] {
      CensusAnalyzerObj.loadIndiaStateCensusData(wrongFilePathForIndiaStateCensusData)
    }
    assert(thrown.getMessage === Issue.PATH_INCORRECT.toString)
  }
  test("givenIndianCensusDataFileIfWrongTypeShouldThrowException") {
    val thrown = intercept[Exception] {
      CensusAnalyzerObj.loadIndiaStateCensusData(wrongTypeOfIndiaStateCensusData)
    }
    assert(thrown.getMessage === Issue.INCORRECT_FILE.toString)
  }
  test("givenIndianCensusDataFileIfWrongHeaderShouldThrowException") {
    val thrown = intercept[Exception] {
      CensusAnalyzerObj.loadIndiaStateCensusData(wrongHeaderIndiaStateCensusPath)
    }
    assert(thrown.getMessage === Issue.INVALID_FIELDS.toString)
  }
  test("givenIndiaStateCodeCSVFileShouldReturnCorrectNumberOfRecords") {
    assert(CensusAnalyzerObj.loadIndiaStateCodeData(indiaStateCodeDataPath) === 37)
  }
  test("givenIndiaStateCodeCSVFileIfWrongFilePathShouldThrowException") {
    val thrown = intercept[Exception] {
      CensusAnalyzerObj.loadIndiaStateCodeData(wrongIndiaStateCodeFilePath)
    }
    assert(thrown.getMessage === Issue.PATH_INCORRECT.toString)
  }
  test("givenIndiaStateCodeFileIfWrongTypeShouldThrowException") {
    val thrown = intercept[Exception] {
      CensusAnalyzerObj.loadIndiaStateCensusData(wrongFileTypeIndiaStateCodePath)
    }
    assert(thrown.getMessage === Issue.INCORRECT_FILE.toString)
  }
  test("givenIndiaStateCodeFileIfWrongHeaderShouldThrowException") {
    val thrown = intercept[Exception] {
      CensusAnalyzerObj.loadIndiaStateCensusData(wrongHeaderIndiaStateCodePath)
    }
    assert(thrown.getMessage === Issue.INVALID_FIELDS.toString)
  }

}
