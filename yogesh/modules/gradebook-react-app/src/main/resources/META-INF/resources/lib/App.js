import React,{useState,useEffect} from 'react';
import ClayTable from '@clayui/table';
import ClayForm, {ClayInput} from '@clayui/form';
import Button from '@clayui/button';
import DropDown from '@clayui/drop-down';

function App() { 

  const list=[4,5,6]
  const [lists,setList]=useState(list); 
  var m={
	       name: "s",
	       description: "s",
	       userId: 2
	   };
  function vamshicreate()
  {
     console.log("Hello World");
	 var a=document.getElementById('titles').value;
	 var b=document.getElementById('descs').value;
	 var c=document.getElementById('ids').value;
   Liferay.Service(
		   '/gradebook.krishna/adds',
		   {
		       name: a,
		       desc: b,
		       userId: c
		   },
		   function(obj) {
		       console.log(obj);
		   }
		   );
  }
  function vamshiget()
  {
	  var c=document.getElementById('ids').value;
	  Liferay.Service(
			  '/gradebook.krishna/gets',
			  {
			      userId: c
			  },
			  function(obj) {
			      console.log(obj);
			      m=obj;
			      setList(m);
			  }
			  );
	  console.log("List is 1");
	  console.log(m);
  }
  function vamshidelete()
  {
	  var c=document.getElementById('ids').value;
	  Liferay.Service(
			  '/gradebook.krishna/deletes',
			  {
			      userId: c
			  },
			  function(obj) {
			      console.log(obj);
			  }
			  );
  }
  function vamshiupdate()
  {
	  var a=document.getElementById('titles').value;
	  var b=document.getElementById('descs').value;
	  var c=document.getElementById('ids').value;
	  Liferay.Service(
			  '/gradebook.krishna/updates',
			  {
			      name: a,
			      desc: b,
			      userId: c
			  },
			  function(obj) {
			      console.log(obj);
			  }
			  );
  }
  
  function vamshigetall()
  {
	  Liferay.Service(
			  '/gradebook.krishna/Get-all',
			  function(obj) {
			      console.log(obj);
			      m=obj;
			      setList(m);
			      console.log(lists)
			  }
			  );
  }
  
  function submit()
  {
    console.log("Clicked")
    var a=document.getElementById('titles').value;
    var b=document.getElementById('descs').value;
    var c=document.getElementById('ids').value;
    const newList=[];
    newList.push({
      id:c,
      name:a,
      desc:b,
    })
      setList(lists => [...lists, newList]);
      console.log(lists)
  }
	return (
		<>
		<div inline>
		<div className="sheet sheet-lg">
      <div className="sheet-header">
        <h2 className="sheet-title center">Application programming interface (API)</h2>
      </div>
      <div className="sheet-section">
		<ClayForm.Group className="form-group-sm has-success">
        <label htmlFor="basicInput">TITLE</label>
        <ClayInput placeholder="Enter The Title" type="text" id="titles"></ClayInput>
      </ClayForm.Group>

		<ClayForm.Group className="form-group-sm has-success">
        <label htmlFor="basicInput">DESCRIPTION</label>
        <textarea className="form-control" placeholder="Enter The Description" id="descs"></textarea>
      </ClayForm.Group>

	  <ClayForm.Group className="form-group-sm has-success" id='ID' >
        <label htmlFor="basicInput">ID</label>
        <ClayInput placeholder="Enter The ID" type="number" id="ids"></ClayInput>
      </ClayForm.Group>

      </div>

      <div className="sheet-footer sheet-footer-btn-block-sm-down"  id="Knowledges">
        <div className="btn-group" style={{textAlign : 'center'}}>
          <div className="btn-group-item">
            <button className="btn btn-success" type="button" onClick={vamshicreate}>Vamshi Create</button>
          </div>
		  <div className="btn-group-item">
            <button className="btn btn-warning" type="button" onClick={vamshiget}>Vamshi Read</button>
          </div>
		  <div className="btn-group-item">
            <button className="btn btn-primary" type="button" onClick={vamshiupdate}>Vamshi Update</button>
          </div>
		  <div className="btn-group-item">
            <button className="btn btn-danger" type="button" onClick={vamshidelete}>Vamshi Delete</button>
          </div>
          <div className="btn-group-item">
          <button className="btn btn-warning" type="button" onClick={vamshigetall}>Vamshi Read All</button>
        </div>
        </div>
      </div>
    </div>
  <div id='display2'>
	{/*	<ClayTable>
      <ClayTable.Body>
        <ClayTable.Row>
          <ClayTable.Cell headingCell id='clayhname'>{"Title"}</ClayTable.Cell>
          <ClayTable.Cell headingCell id='clayhdesc'>{"Description"}</ClayTable.Cell>
          <ClayTable.Cell headingCell id='clayhid'>{"Id"}</ClayTable.Cell>
        </ClayTable.Row>
      { 
                  lists.map((current) => (
                  <ClayTable.Row>
                  <ClayTable.Cell headingTitle id='clayname'>{current[0].name}</ClayTable.Cell>
                  <ClayTable.Cell id='claydesc'>{current[0].desc}</ClayTable.Cell>
                  <ClayTable.Cell id='clayid'>{current[0].id}</ClayTable.Cell>
                </ClayTable.Row>
                  ))
                
      }
      </ClayTable.Body>
    </ClayTable>
	*/}
	<ClayTable>
    <ClayTable.Body>
    <ClayTable.Row>
      <ClayTable.Cell headingCell id='clayhname'>{"Title"}</ClayTable.Cell>
      <ClayTable.Cell headingCell id='clayhdesc'>{"Description"}</ClayTable.Cell>
      <ClayTable.Cell headingCell id='clayhid'>{"Id"}</ClayTable.Cell>
    </ClayTable.Row>
  { 
	  lists.map((current) => (
              <ClayTable.Row>
              <ClayTable.Cell headingTitle id='clayname'>{current.name}</ClayTable.Cell>
              <ClayTable.Cell id='claydesc'>{current.description}</ClayTable.Cell>
              <ClayTable.Cell id='clayid'>{current.userId}</ClayTable.Cell>
            </ClayTable.Row>
	  )) 
            
  }
  </ClayTable.Body>
</ClayTable>
    </div>
	</div>
	</>
  );
  }
export default App;
