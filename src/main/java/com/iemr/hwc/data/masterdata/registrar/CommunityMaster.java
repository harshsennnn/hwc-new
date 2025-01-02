/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.hwc.data.masterdata.registrar;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name = "m_community")
public class CommunityMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Expose
	@Column(name = "CommunityID")
	private Short communityID;
	@Expose
	@Column(name = "CommunityType")
	private String communityType;
	@Expose
	@Column(name = "CommunityDesc")
	private String communityDesc;
	@Expose
	@Column(name = "Deleted")
	private Boolean deleted;

	public CommunityMaster() {
	}

	public CommunityMaster(Short communityID, String communityType) {
		this.communityID = communityID;
		this.communityType = communityType;
	}

	public static ArrayList<CommunityMaster> getCommunityMasterData(ArrayList<Object[]> resList) {
		ArrayList<CommunityMaster> resArray = new ArrayList<>();
		for (Object[] obj : resList) {
			CommunityMaster cOBJ = new CommunityMaster((Short) obj[0], (String) obj[1]);
			resArray.add(cOBJ);
		}
		return resArray;
	}

}
