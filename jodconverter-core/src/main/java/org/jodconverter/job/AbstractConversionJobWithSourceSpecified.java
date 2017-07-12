/*
 * Copyright 2004 - 2012 Mirko Nasato and contributors
 *           2016 - 2017 Simon Braconnier and contributors
 *
 * This file is part of JODConverter - Java OpenDocument Converter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jodconverter.job;

import java.io.File;

import org.jodconverter.document.DocumentFormat;

/**
 * Base class for all job with source specified implementations.
 *
 * @see ConversionJobWithSourceSpecified
 */
public abstract class AbstractConversionJobWithSourceSpecified
    implements ConversionJobWithSourceSpecified {

  protected final SourceDocumentSpecs source;

  protected AbstractConversionJobWithSourceSpecified(SourceDocumentSpecs source) {
    super();

    this.source = source;
  }

  @Override
  public ConversionJob to(final File target) {

    return to(FileTargetDocumentSpecs.make(target));
  }

  @Override
  public ConversionJob to(final File target, final DocumentFormat format) {

    return to(FileTargetDocumentSpecs.make(target, format));
  }
}