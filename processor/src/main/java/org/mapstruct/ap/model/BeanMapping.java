/**
 *  Copyright 2012-2013 Gunnar Morling (http://www.gunnarmorling.de/)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.model;

import java.util.List;

public class BeanMapping {

	private final Type sourceType;
	private final Type targetType;
	private final List<PropertyMapping> propertyMappings;
	private final MappingMethod mappingMethod;
	private final MappingMethod reverseMappingMethod;
	private final boolean isIterableMapping;

	public BeanMapping(Type sourceType, Type targetType, List<PropertyMapping> propertyMappings, MappingMethod mappingMethod,
					   MappingMethod reverseMappingMethod) {
		this.sourceType = sourceType;
		this.targetType = targetType;
		this.propertyMappings = propertyMappings;
		this.mappingMethod = mappingMethod;
		this.reverseMappingMethod = reverseMappingMethod;
		this.isIterableMapping = mappingMethod.getElementMappingMethod() != null;
	}

	public Type getSourceType() {
		return sourceType;
	}

	public Type getTargetType() {
		return targetType;
	}

	public List<PropertyMapping> getPropertyMappings() {
		return propertyMappings;
	}

	public MappingMethod getMappingMethod() {
		return mappingMethod;
	}

	public MappingMethod getReverseMappingMethod() {
		return reverseMappingMethod;
	}

	public boolean getIterableMapping() {
		return isIterableMapping;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append( sourceType );
		stringBuilder.append( " <=> " );
		stringBuilder.append( targetType );


		return stringBuilder.toString();
	}
}