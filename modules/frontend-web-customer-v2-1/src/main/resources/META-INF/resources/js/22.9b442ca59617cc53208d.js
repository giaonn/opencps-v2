webpackJsonp([22],{230:function(t,e,s){var a=s(148)(s(684),s(691),null,null);t.exports=a.exports},684:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={data:function(){return{thongTinChiTietHoSo:{}}},computed:{loading:function(){return this.$store.getters.loading}},created:function(){},methods:{initData:function(t){this.thongTinChiTietHoSo=t},durationText:function(t,e){var s;if(1===t&&e>8){var a=Math.floor(e/8)+" ngày",r=void 0;r=e%8!=0?8*(e/8-Math.floor(e/8))+" giờ":"",s=a+" "+r}else 0===t?s=e+" ngày":1===t&&e<=8&&(s=e+" giờ");return s}},filters:{dateTimeView:function(t){if(t){var e=new Date(t);return e.getDate().toString().padStart(2,"0")+"/"+(e.getMonth()+1).toString().padStart(2,"0")+"/"+e.getFullYear()+"  "+e.getHours().toString().padStart(2,"0")+":"+e.getMinutes().toString().padStart(2,"0")}return""}}}},691:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("v-card",[s("v-card-text",{staticClass:"pb-0"},[s("v-layout",{attrs:{wrap:""}},[s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Thủ tục: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm10:""}},[s("v-subheader",{staticClass:"pl-0 header-text-field text-header"},[t._v("  "+t._s(t.thongTinChiTietHoSo.serviceName)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Mã số hồ sơ: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.dossierNo)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Thời hạn giải quyết: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.durationText(t.thongTinChiTietHoSo.durationUnit,t.thongTinChiTietHoSo.durationCount))+" làm việc  ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Ngày tiếp nhận: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.receiveDate)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Ngày hẹn trả: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.dueDate)+" ")])],1)],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=22.9b442ca59617cc53208d.js.map