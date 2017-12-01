package com.derbysoft.quill

import io.getquill.{MysqlJdbcContext, SnakeCase}

trait BaseTrait {
  lazy val ctx = new MysqlJdbcContext[SnakeCase](SnakeCase, "ctx")

}
