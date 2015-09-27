/*
 * Copyright 2015 hilemz
 *
 * http://www.wykop.pl/ludzie/hilemz/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.hilemz.yahoofinanceapi;

/**
 * <p>
 * Date: 20.09.2015
 * </p>
 *
 * <p>
 * This enum class provides all available time periods for historical data from Yahoo Finance API.
 * </p>
 *
 * @author hilemz
 */
public enum TimePeriod {

	Daily('d'),
	Weekly('w'),
	Monthly('m');

	private final char code;

	TimePeriod(char code) {
		this.code = code;
	}

	public char getCode() {
		return code;
	}
}