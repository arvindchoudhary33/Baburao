import React ,{useRef } from 'react';
import Login from './Login.js';
import {MdClose } from 'react-icons/md';
import styled  from 'styled-components'

//Using styled-component for the background of the modal (popup)
const Background = styled.div`
background:rgba(0,0,0,0.6);
width:100%;
height:100%;
position:fixed;
overflow-y:scroll;
z-index:100;

`
export  const Modal = ({showModal,setShowModal ,whichPage}) => {
    const modalRef = useRef();
    const closeModal = e => {
        if (modalRef.current === e.target){
            setShowModal(false);
        }
        console.log(e.target);
    };

return(
    <>
    {
    showModal ? (  
                 <Background> 
                 <div className='modal-container' ref={modalRef} onClick={closeModal}>
                 <Login whichPage={whichPage}/>
                 <MdClose aria-label='close modal' className='close' onClick={() => setShowModal
                 (prev => !prev) } /></div>
                </Background>
    ):null}
    </>
)
}

