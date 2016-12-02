package com.tw.geekday.cep

import com.tw._
import org.apache.kafka.streams.KeyValue
import org.apache.kafka.streams.kstream.{KGroupedTable, KStream, KTable, Reducer}

class Cep {

  def process(
    stream1: KStream[Key, Value1],
    table2: KTable[Key, Value2]
  ): KStream[Key, Value3] = {


    ???
  }

}
