/*
 * Copyright (C) 2014 ZeroTurnaround <support@zeroturnaround.com>
 * Contains fragments of code from Apache Commons Exec, rights owned
 * by Apache Software Foundation (ASF).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zeroturnaround.exec.test;

import java.io.OutputStream;

import org.junit.Assert;
import org.junit.Test;
import org.zeroturnaround.exec.ProcessExecutor;
import org.zeroturnaround.exec.stream.PumpStreamHandler;


public class ProcessExecutorLoggerTest {

  @Test
  public void testFullName() throws Exception {
//    String fullName = "my.full.Logger";
//    testSlf4jLoggerName(fullName, Slf4jStream.of(fullName));
  }

  @Test
  public void testShortName() throws Exception {
//    String shortName = "MyLogger";
//    String fullName = getClass().getName() + "." + shortName;
//    testSlf4jLoggerName(fullName, Slf4jStream.of(shortName));
  }

  @Test
  public void testClassNameWithShortName() throws Exception {
//    String shortName = "MyLogger";
//    String fullName = getClass().getName() + "." + shortName;
//    testSlf4jLoggerName(fullName, Slf4jStream.of(getClass(), shortName));
  }

  @Test
  public void testMyClassName() throws Exception {
//    String fullName = getClass().getName();
//    testSlf4jLoggerName(fullName, Slf4jStream.ofCaller());
  }

  private void testSlf4jLoggerName(String fullName) {
//    ProcessExecutor executor = new ProcessExecutor();
//    executor.redirectOutput(stream.asInfo());
//    PumpStreamHandler pumps = executor.pumps();
//    OutputStream out = pumps.getOut();
//    Assert.assertTrue("Slf4jInfoOutputStream expected", out instanceof Slf4jInfoOutputStream);
//    Assert.assertEquals(fullName, ((Slf4jInfoOutputStream) out).getLogger().getName());
  }

}
