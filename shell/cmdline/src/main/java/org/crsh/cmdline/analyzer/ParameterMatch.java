/*
 * Copyright (C) 2010 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.crsh.cmdline.analyzer;

import org.crsh.cmdline.binding.TypeBinding;
import org.crsh.cmdline.ParameterDescriptor;

import java.util.List;

/**
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public class ParameterMatch<P extends ParameterDescriptor<B>, B extends TypeBinding> {

  /** . */
  private final P parameter;

  /** . */
  private final List<String> values;

  public ParameterMatch(P parameter, List<String> values) {
    this.parameter = parameter;
    this.values = values;
  }

  public P getParameter() {
    return parameter;
  }

  public List<String> getValues() {
    return values;
  }
}